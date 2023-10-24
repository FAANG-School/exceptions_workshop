package task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import task_2.exceptions.NotEnoughMaterialException;
import task_2.exceptions.NotEnoughWoodException;
import task_2.exceptions.OrdersListIsEmptyException;

@Slf4j
public class OlivandersShop {

	private final Map<String, Integer> woodTypeCount = new HashMap<>();
	private final Map<String, Integer> coreMaterialCount = new HashMap<>();
	private final List<WandOrder> orders = new ArrayList<>();

	{
		woodTypeCount.put("Acacia", 5);
		woodTypeCount.put("English Oak", 10);
		woodTypeCount.put("Hawthorn", 2);
		woodTypeCount.put("Elder", 4);
		woodTypeCount.put("Beech", 19);
		woodTypeCount.put("Vine", 17);

		coreMaterialCount.put("Phoenix feather", 5);
		coreMaterialCount.put("Unicorn hair", 22);
		coreMaterialCount.put("Dragon heartstring", 15);

	}

	public void placeOrder(WandOrder order) {

		if (order == null) {
			throw new IllegalArgumentException("please check you order");
		}

		String woodType = order.getWand().getWoodType();
		String coreMaterial = order.getWand().getCoreMaterial();
		Integer wtc = woodTypeCount.get(woodType);
		Integer cmc = coreMaterialCount.get(coreMaterial);
		Integer quantity = order.getQuantity();

		if (wtc == null || wtc < quantity) {
			log.warn("Order {} wasn't placed", order);
			throw new NotEnoughWoodException("Not enough " + woodType + " in the store");
		} else if (cmc == null || cmc < quantity) {
			log.warn("Order {} wasn't placed", order);
			throw new NotEnoughMaterialException("Not enough " + coreMaterial + " in the store");
		} else {
			orders.add(order);
			woodTypeCount.replace(woodType, wtc - quantity);
			coreMaterialCount.replace(coreMaterial, cmc - quantity);
			log.info("Order {} was placed", order);
		}

	}

	public Optional<Wand> findMostPowerfulWand() {

		if (orders.isEmpty()) {
			throw new OrdersListIsEmptyException("Order list is empty");
		}

		return orders.stream().map(WandOrder::getWand).max(Comparator.comparingInt(Wand::getPowerLevel));
	}

	public static void main(String[] args) {
		
		OlivandersShop shop = new OlivandersShop();
		
		try {
			shop.findMostPowerfulWand();
		} catch (OrdersListIsEmptyException e) {
			log.error("Try to find wand: {}", e.getMessage());
		}

		try {
			new Wand(null, 0, null, 0);
		} catch (IllegalArgumentException e) {
			log.error("Wrong arguments wand creation: {}", e.getMessage());
		}

		Wand wand1 = new Wand("Acacia", 8, "Phoenix feather", 4);
		Wand wand2 = new Wand("English Oak", 9, "Unicorn hair", 5);
		Wand wand3 = new Wand("Hawthorn", 10, "Dragon heartstring", 9);
		Wand wand4 = new Wand("Elder", 12, "Phoenix feather", 8);
		Wand wand5 = new Wand("Beech", 15, "Phoenix feather", 10);
		
		try {
			new WandOrder(null, wand5, 0);
		} catch (IllegalArgumentException e) {
			log.error("Wrong arguments WandOrder creation: {}", e.getMessage());
		}
		
		WandOrder wandOrder1 = new WandOrder("Lord Voldemort", wand1, 1);
		WandOrder wandOrder2 = new WandOrder("Harry Potter", wand2, 2);
		WandOrder wandOrder3 = new WandOrder("Ron Weasley", wand3, 3);
		WandOrder wandOrder4 = new WandOrder("Hermione Jean Granger", wand4, 5);
		WandOrder wandOrder5 = new WandOrder("Harry Potter", wand5, 5);
		
		shop.placeOrder(wandOrder1);
		shop.placeOrder(wandOrder2);
		try {
			shop.placeOrder(wandOrder3);
		} catch (Exception e) {
			log.error("Order placing exception: {}", e.getMessage());
		}
		
		try {
			shop.placeOrder(wandOrder4);
		} catch (Exception e) {
			log.error("Order placing exception : {}", e.getMessage());
		}
			
		try {
			shop.placeOrder(wandOrder5);
		} catch (Exception e) {
			log.error("Order placing exception : {}", e.getMessage());
		}

	}

}
