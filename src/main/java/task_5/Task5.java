package task_5;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Task5 {

	public static void main(String[] args) {
		
		Hero hero1 = new Hero("Axe", 15);
		Hero hero2 = new Hero("Huskar", 10);
		Hero hero3= new Hero("Kunkka", 1);
		Hero hero4 = new Hero("Riki", 55);
		Hero hero5 = new Hero("Pugna", 22);
		Hero hero6 = new Hero("Phoenix", 100);
		
		MagicItem magicItem1 = new MagicItem("Magic Wand", 36, 13);
		MagicItem magicItem2 = new MagicItem("Bracer", 24, 10);
		MagicItem magicItem3 = new MagicItem("Soul Ring", 19, 25);
		MagicItem magicItem4 = new MagicItem("Helm of the Dominator", 39, 45);
		MagicItem magicItem5 = new MagicItem("Falcon Blade", 16, 20);
		MagicItem magicItem6 = new MagicItem("Oblivion Staff", 26, 31);
		MagicItem magicItem7 = new MagicItem("Pavise", 19, 18);
		MagicItem magicItem8 = new MagicItem("Mekansm", 22, 65);
		MagicItem magicItem9 = new MagicItem("Force Staff", 150, 19);
		
		try {
			new Hero(null, 15);
		} catch (IllegalArgumentException e) {
			log.error("Creation Hero exception: {}", e.getMessage());
		}
		
		try {
			new Hero(" ", 15);
		} catch (IllegalArgumentException e) {
			log.error("Creation Hero exception: {}", e.getMessage());
		}
		
		try {
			new Hero("Hero", -1);
		} catch (IllegalArgumentException e) {
			log.error("Creation Hero exception: {}", e.getMessage());
		}
		
		try {
			hero1.addItemToInventory(null);
		} catch (IllegalArgumentException e) {
			log.error("Exception when invoke addItemToInventory(): {}", e.getMessage());
		}
		
		// TODO add unit testing
		
	}

}
