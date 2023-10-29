package task_5;

import task_5.exceptions.BattleException;

import java.util.List;

public class Hero {
    private String heroName;
    private int currentMana;
    List<MagicItem> inventory;


    public Hero(String heroName, int currentMana, List<MagicItem> inventory) {
        this.heroName = heroName;
        this.currentMana = currentMana;
        this.inventory = inventory;
    }


    public void addItemToInventory(MagicItem magicItem) {
        inventory.add(magicItem);
    }

    public void useItem(MagicItem magicItem) throws BattleException {
        if (!inventory.contains(magicItem)) {
            throw new BattleException("Нет такого предмета " + magicItem.getItemName());
        }
        if (currentMana < magicItem.getManaCost()) {
            throw new BattleException("Не хватает маны для использования " + magicItem.getItemName());
        }
        if (Math.random() < 0.5) {
            throw new BattleException("Предмет " + magicItem.getItemName() + " восстанавливается.");
        }
        System.out.println(heroName + " использовал " + magicItem.getItemName());
        currentMana -= magicItem.getManaCost();
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
