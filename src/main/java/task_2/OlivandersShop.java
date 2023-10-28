package task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import task_2.exceptions.NotEnoughMaterialException;
import task_2.exceptions.NotEnoughWoodException;
import task_2.exceptions.OrdersListIsEmptyException;

@Slf4j
@Getter
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

}
