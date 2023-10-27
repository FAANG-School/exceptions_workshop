package task_5;

import java.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import lombok.Getter;
import task_5.exceptions.BattleException;
import task_5.exceptions.NoItemsException;

@Getter
public class Hero {

	private final String heroName;
	private int currentMana;
	private final Set<MagicItem> inventory;
	private final Map<String, Long> itemUsage;

	public Hero(String heroName, int currentMana) {

		if (heroName == null || heroName.isBlank()) {
			throw new IllegalArgumentException("Name can't be null or blank");
		}

		if (currentMana < 0) {
			throw new IllegalArgumentException("Mana can't be negative");
		}
		this.heroName = heroName;
		this.currentMana = currentMana;
		this.inventory = new HashSet<>();
		this.itemUsage = new HashMap<>();
	}

	public boolean addItemToInventory(MagicItem item) {

		if (item == null) {
			throw new IllegalArgumentException("Null agrs");
		}

		return inventory.add(item);
	}

	public void useItem(MagicItem item) {

		if (item == null) {
			throw new IllegalArgumentException("Null agrs");
		}

		String itemName = item.getItemName();
		int itemManaCost = item.getManaCost();

		if (!inventory.contains(item)) {
			throw new NoItemsException(itemName + "out of inventory");
		}

		if (itemManaCost > currentMana) {
			throw new BattleException("Not enough mana to use " + itemName);
		}

		if (itemUsage.containsKey(itemName)
				&& Instant.now().getEpochSecond() - itemUsage.get(itemName) < item.getCooldown()) {
			throw new BattleException(itemName + " still cooling down");
		}

		itemUsage.put(itemName, Instant.now().getEpochSecond());
		currentMana -= itemManaCost;

	}

}
