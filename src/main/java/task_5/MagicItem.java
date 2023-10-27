package task_5;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class MagicItem {

	private final String itemName;
	private final int manaCost;
	private final int cooldown;

	public MagicItem(String itemName, int manaCost, int cooldown) {
		
		if (itemName == null || itemName.isBlank()) {
			throw new IllegalArgumentException("Name can't be null or blank");
		}

		if (manaCost <= 0 || cooldown <= 0) {
			throw new IllegalArgumentException("Cost and cooldown time must be positive");
		}
		this.itemName = itemName;
		this.manaCost = manaCost;
		this.cooldown = cooldown;
	}
	
	

}
