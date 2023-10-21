package task_5;

public class MagicItem {
    private String itemName;

    private int manaCost;

    private int cooldown;

    public MagicItem(String itemName, int manaCost, int cooldown) {
        if (itemName == null || itemName.isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty.");
        }
        if (manaCost <= 0) {
            throw new IllegalArgumentException("Mana cost must be positive.");
        }
        if (cooldown <= 0) {
            throw new IllegalArgumentException("Cooldown must be positive.");
        }

        this.itemName = itemName;
        this.manaCost = manaCost;
        this.cooldown = cooldown;
    }

    public String getItemName() {
        return itemName;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getCooldown() {
        return cooldown;
    }
}
