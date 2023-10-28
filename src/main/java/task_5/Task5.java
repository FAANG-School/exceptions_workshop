package task_5;

import lombok.extern.slf4j.Slf4j;
import task_5.exceptions.BattleException;
import task_5.exceptions.NoItemsException;

@Slf4j
public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		
		Hero hero1 = new Hero("Axe", 25);
		Hero hero2 = new Hero("Huskar", 10);
		Hero hero3= new Hero("Kunkka", 1);
		Hero hero4 = new Hero("Riki", 55);
		Hero hero5 = new Hero("Pugna", 22);
		Hero hero6 = new Hero("Phoenix", 10000);
		
		MagicItem magicItem1 = new MagicItem("Magic Wand", 36, 13);
		MagicItem magicItem2 = new MagicItem("Bracer", 24, 10);
		MagicItem magicItem3 = new MagicItem("Soul Ring", 19, 25);
		MagicItem magicItem4 = new MagicItem("Helm of the Dominator", 39, 45);
		MagicItem magicItem5 = new MagicItem("Falcon Blade", 16, 20);
		MagicItem magicItem6 = new MagicItem("Oblivion Staff", 26, 31);
		MagicItem magicItem7 = new MagicItem("Pavise", 19, 18);
		MagicItem magicItem8 = new MagicItem("Mekansm", 22, 65);
		MagicItem magicItem9 = new MagicItem("Force Staff", 150, 19);
		
//		try {
//			new MagicItem(null, 150, 19);
//		} catch (IllegalArgumentException e) {
//			log.error("Creation MagicItem exception: {}", e.getMessage());
//		}
//		
//		try {
//			new MagicItem(" ", 150, 19);
//		} catch (IllegalArgumentException e) {
//			log.error("Creation MagicItem exception: {}", e.getMessage());
//		}
//		
//		try {
//			new MagicItem("Test ", -1, 19);
//		} catch (IllegalArgumentException e) {
//			log.error("Creation MagicItem exception: {}", e.getMessage());
//		}
//		
//		try {
//			new MagicItem("Test ", 100, -1);
//		} catch (IllegalArgumentException e) {
//			log.error("Creation MagicItem exception: {}", e.getMessage());
//		}
//		
//		try {
//			new Hero(null, 15);
//		} catch (IllegalArgumentException e) {
//			log.error("Creation Hero exception: {}", e.getMessage());
//		}
//		
//		try {
//			new Hero(" ", 15);
//		} catch (IllegalArgumentException e) {
//			log.error("Creation Hero exception: {}", e.getMessage());
//		}
//		
//		try {
//			new Hero("Hero", -1);
//		} catch (IllegalArgumentException e) {
//			log.error("Creation Hero exception: {}", e.getMessage());
//		}
//		
//		try {
//			hero1.addItemToInventory(null);
//		} catch (IllegalArgumentException e) {
//			log.error("Exception when invoke addItemToInventory(): {}", e.getMessage());
//		}
//		
//		hero1.addItemToInventory(magicItem9);
//		hero1.addItemToInventory(magicItem9);
//		hero1.addItemToInventory(magicItem2);
//		
//		
//		try {
//			hero1.useItem(null);
//		} catch (IllegalArgumentException e) {
//			log.error("Exception when invoke useItem(): {}", e.getMessage());
//		}
//		
//		try {
//			hero1.useItem(magicItem1);
//		} catch (NoItemsException e) {
//			log.error("Exception when invoke useItem(): {}", e.getMessage());
//		}
//		
//		try {
//			hero1.useItem(magicItem9);
//		} catch (BattleException e) {
//			log.error("Exception when invoke useItem(): {}", e.getMessage());
//		}
//		
//		hero1.useItem(magicItem2);
//		
		BattleSimulator battleSimulator = new BattleSimulator();
//		
//		try {
//			battleSimulator.simulateBattle(null, 1);
//		} catch (IllegalArgumentException e) {
//			log.error("Exception when invoke simulateBattle(): {}", e.getMessage());
//		}
//		
//		try {
//			battleSimulator.simulateBattle(hero1, 0);
//		} catch (IllegalArgumentException e) {
//			log.error("Exception when invoke simulateBattle(): {}", e.getMessage());
//		}
		
		hero6.addItemToInventory(magicItem1);
		hero6.addItemToInventory(magicItem2);
		hero6.addItemToInventory(magicItem3);
		hero6.addItemToInventory(magicItem4);
		hero6.addItemToInventory(magicItem5);
		hero6.addItemToInventory(magicItem6);
		hero6.addItemToInventory(magicItem7);
		hero6.addItemToInventory(magicItem8);
		hero6.addItemToInventory(magicItem9);
		
		battleSimulator.simulateBattle(hero6, 10);
		
	}

}
