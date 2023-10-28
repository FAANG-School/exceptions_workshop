package exceptions_workshop.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task_5.MagicItem;

public class MagicItemTest {

	@Test
	void creation() {
		Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new MagicItem(null, 150, 19));
		
		Exception exception2 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new MagicItem(" ", 150, 19));
		
		Exception exception3 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new MagicItem("Test ", -1, 19));
		
		Exception exception4 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new MagicItem("Test ", 100, -1));
		
		assertEquals("Name can't be null or blank", exception.getMessage());
		assertEquals("Name can't be null or blank", exception2.getMessage());
		assertEquals("Cost and cooldown time must be positive", exception3.getMessage());
		assertEquals("Cost and cooldown time must be positive", exception4.getMessage());

	}
}
