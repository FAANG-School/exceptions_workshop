package task_5.solution;

public class MagicItem {
    private String itemName;
    private int manaCost;
    private int cooldown;

    public MagicItem(String itemName, int manaCost, int cooldown) {
        if (itemName == null || itemName.isEmpty() || manaCost <= 0 || cooldown < 0) {
            throw new IllegalArgumentException("Invalid MagicItem parameters");
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
