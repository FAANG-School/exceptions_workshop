package task_5.solution;

import task_5.exception.BattleException;

import java.util.ArrayList;
import java.util.List;

public class Hero2 {
    private String heroName;
    private int currentMana;
    List<MagicItem> inventory;

    public Hero2(String heroName, int currentMana) {
        this.heroName = heroName;
        this.currentMana = currentMana;
        this.inventory = new ArrayList<>();
    }

    public void addItemToInventory(MagicItem magicItem) {
        inventory.add(magicItem);
    }

    public void useItem(MagicItem magicItem) throws BattleException {
        if (!inventory.contains(magicItem)) {
            throw new BattleException("У героя нет магического предмета " + magicItem.getItemName());
        }
        if (currentMana < magicItem.getManaCost()) {
            throw new BattleException("Недостаточно маны для использования " + magicItem.getItemName());
        }
        if (Math.random() < 0.5) {
            throw new BattleException("Предмет " + magicItem.getItemName() + " восстанавливается.");
        }
        System.out.println(heroName + " использовал " + magicItem.getItemName());
        currentMana -= magicItem.getManaCost();
    }
}
