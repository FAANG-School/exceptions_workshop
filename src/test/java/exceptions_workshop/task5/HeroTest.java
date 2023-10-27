package exceptions_workshop.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task_5.Hero;
import task_5.MagicItem;

public class HeroTest {

	private final Hero hero1 = new Hero("Axe", 15);
	private final Hero hero2 = new Hero("Huskar", 10);
	private final MagicItem magicItem1 = new MagicItem("Magic Wand", 36, 13);
	private final MagicItem magicItem2 = new MagicItem("Bracer", 24, 10);

	@Test
	void creation() {
		Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Hero(null, 4));
		
		Exception exception2 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Hero(" ", 5));
		
		Exception exception3 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Hero("Huskar", -100));
		
		assertEquals("Name can't be null or blank", exception.getMessage());
		assertEquals("Name can't be null or blank", exception2.getMessage());
		assertEquals("Mana can't be negative", exception3.getMessage());

	}
	
	@Test
	void addItemToInventory() {
		
		Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
				() -> hero1.addItemToInventory(null));
		assertEquals("Null agrs", exception.getMessage());
		
		hero2.addItemToInventory(new MagicItem("Magic Wand", 36, 13));
		
		assertTrue(hero2.getInventory().contains(magicItem1));
	}

}
