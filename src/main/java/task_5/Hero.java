package task_5;

import task_5.exceptions.BattleException;
import task_5.exceptions.CooldownException;
import task_5.exceptions.NoItemsException;
import task_5.exceptions.NotEnoughManaException;

import java.util.*;

public class Hero {
    private String heroName;

    private int currentMana;

    private List<MagicItem> inventory;

    private Map<String, Long> itemUsages;

    public Hero(String heroName, int currentMana) {
        this.heroName = heroName;
        this.currentMana = currentMana;
        inventory = new ArrayList<>();
        itemUsages = new HashMap<>();
    }

    public void useItem() {
        Random random = new Random();
        int randomIndex = random.nextInt(inventory.size());
        MagicItem item = inventory.get(randomIndex);
        boolean isItemReady = (System.currentTimeMillis() - itemUsages.get(item.getItemName())) > item.getCooldown();

        if(!inventory.contains(item)) {
            throw new NoItemsException("The hero has no items to use: " + item.getItemName());
        }
        if(currentMana < item.getManaCost()) {
            throw new NotEnoughManaException("Not enough mana to use the item: " + item.getItemName());
        }
        if(!isItemReady) {
            throw new CooldownException("The item is on cooldown: " + item.getItemName());
        }

        currentMana -= item.getManaCost();
        itemUsages.put(item.getItemName(), System.currentTimeMillis());
        System.out.println(heroName + " used " + item.getItemName());
    }

    public void addItemToInventory(MagicItem item) {
        itemUsages.put(item.getItemName(), System.currentTimeMillis() - item.getCooldown());
        inventory.add(item);
    }

    public String getHeroName() {
        return heroName;
    }

    public  int getCurrentMana() {
        return currentMana;
    }

    public List<MagicItem> getInventory() {
        return inventory;
    }
}
