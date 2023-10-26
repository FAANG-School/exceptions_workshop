package task_5;

public class MagicItem {
    private String itemName;
    private int manaCost;
    private int cooldown;

    public MagicItem() {
    }

    public MagicItem(String itemName, int manaCost, int cooldown) {
        setItemName(itemName);
        setManaCost(manaCost);
        setCooldown(cooldown);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if (itemName.isBlank()) {
            throw new IllegalArgumentException("name not be empty");
        }
        this.itemName = itemName;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        if (manaCost<=0) {
            throw new IllegalArgumentException("mana cost must be ,ore than 0");
        }
        this.manaCost = manaCost;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        if (cooldown<=0) {
            throw new IllegalArgumentException("cool down must be ,ore than 0");
        }
        this.cooldown = cooldown;
    }
}
