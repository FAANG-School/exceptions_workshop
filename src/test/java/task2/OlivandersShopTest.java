package task2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task_2.OlivandersShop;
import task_2.Wand;
import task_2.WandOrder;
import task_2.exceptions.NotEnoughMaterialException;
import task_2.exceptions.NotEnoughWoodException;
import task_2.exceptions.OrdersListIsEmptyException;

public class OlivandersShopTest {

	private final OlivandersShop shop = new OlivandersShop();
	private final OlivandersShop shop2 = new OlivandersShop();
	private final Wand wand1 = new Wand("Acacia", 8, "Phoenix feather", 4);
	private final Wand wand2 = new Wand("English Oak", 9, "Unicorn hair", 5);
	private final Wand wand3 = new Wand("Hawthorn", 10, "Dragon heartstring", 9);
	private final Wand wand4 = new Wand("Elder", 12, "Phoenix feather", 8);
	private final Wand wand5 = new Wand("Beech", 15, "Phoenix feather", 10);
	private final WandOrder wandOrder1 = new WandOrder("Lord Voldemort", wand1, 1);
	private final WandOrder wandOrder2 = new WandOrder("Harry Potter", wand2, 2);
	private final WandOrder wandOrder3 = new WandOrder("Ron Weasley", wand3, 3);
	private final WandOrder wandOrder4 = new WandOrder("Hermione Jean Granger", wand4, 5);
	private final WandOrder wandOrder5 = new WandOrder("Harry Potter", wand5, 5);

	@Test
	void placeOrder() {
		Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> shop.placeOrder(null));

		assertEquals("please check you order", ex.getMessage());

		shop.placeOrder(wandOrder1);
		assertEquals(wandOrder1.getCustomerName(), shop.getOrders().get(0).getCustomerName());

		shop.placeOrder(wandOrder2);
		assertEquals(wandOrder2.getWand().getWoodType(), shop.getOrders().get(1).getWand().getWoodType());

		Exception ex2 = Assertions.assertThrows(NotEnoughWoodException.class, () -> shop.placeOrder(wandOrder3));
		assertEquals("Not enough " + wandOrder3.getWand().getWoodType() + " in the store", ex2.getMessage());

		Exception ex3 = Assertions.assertThrows(NotEnoughMaterialException.class, () -> shop.placeOrder(wandOrder5));
		assertEquals("Not enough " + wandOrder5.getWand().getCoreMaterial() + " in the store", ex3.getMessage());

	}

	void findMostPowerfulWand() {
		Exception ex = Assertions.assertThrows(OrdersListIsEmptyException.class, () -> shop2.findMostPowerfulWand());
		assertEquals("Order list is empty", ex.getMessage());

		shop2.placeOrder(wandOrder1);
		shop2.placeOrder(wandOrder2);

		assertEquals(shop2.findMostPowerfulWand().get().getPowerLevel(), 5);
	}

}
