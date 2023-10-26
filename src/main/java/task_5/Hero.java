package task_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hero {
    private String heroName;
    private int currentMana;
    private List<MagicItem> inventory;
    private Map<String, Long> itemUsages = new HashMap<>();

    public Hero() {
    }

    public Hero(String heroName, int currentMana, List<MagicItem> inventory) {
        this.heroName = heroName;
        this.currentMana = currentMana;
        this.inventory = inventory;
    }

    public void useItem(MagicItem magicItem) {
        if (!inventory.contains(magicItem)) {
            throw new BattleException(heroName + " dont have " + magicItem.getItemName());
        }
        if (magicItem.getManaCost() > currentMana) {
            throw new BattleException(heroName + " dont have mana to use " + magicItem.getItemName());
        }
        Long l = itemUsages.get(magicItem.getItemName());
        if (l==null) {
            l=0l;
        }
        if ((System.currentTimeMillis() - l)<magicItem.getCooldown()) {
            throw new BattleException(heroName + " dont have opportunity to use " + magicItem.getItemName() + " because its dont restore after use");
        }
        currentMana-=magicItem.getManaCost();
        itemUsages.put(magicItem.getItemName(), System.currentTimeMillis());
        System.out.println(heroName + " use " + magicItem.getItemName());
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public List<MagicItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<MagicItem> inventory) {
        this.inventory = inventory;
    }
}
