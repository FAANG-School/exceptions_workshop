package task2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task_2.Wand;

public class WandTest {
	
	@Test
	void creation() {
		Exception ex = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Wand(null, 8, "Phoenix feather", 4));

		Exception ex2 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Wand(" ", 8, "Phoenix feather", 4));

		Exception ex3 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Wand("English Oak", 9, "", 5));

		assertEquals("please check wand arguments", ex.getMessage());
		assertEquals("please check wand arguments", ex2.getMessage());
		assertEquals("please check wand arguments", ex3.getMessage());
	}

}
