package task2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task_2.Wand;
import task_2.WandOrder;

public class WandOrderTest {
	
	private final Wand wand = new Wand("Acacia", 8, "Phoenix feather", 4);

	@Test
	void creation() {
		Exception ex = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new WandOrder(null, wand, 1));

		Exception ex2 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new WandOrder(" ", wand, 1));

		Exception ex3 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new WandOrder("Lord Voldemort", wand, 0));
		
		Exception ex4 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new WandOrder("Lord Voldemort", null, 5));

		assertEquals("Please check order arguments", ex.getMessage());
		assertEquals("Please check order arguments", ex2.getMessage());
		assertEquals("Please check order arguments", ex3.getMessage());
		assertEquals("Please check order arguments", ex4.getMessage());
	}
}
