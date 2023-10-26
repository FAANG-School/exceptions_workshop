package task_5;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class BattleSimulator {
    public static void main(String[] args) {
        BattleSimulator battleSimulator = new BattleSimulator();
        Hero hero = new Hero();
        hero.setHeroName("Ivan");
        hero.setCurrentMana(50);
        hero.setInventory(new ArrayList<>());
        hero.getInventory().add(new MagicItem("Bluster1", 10, 10));
        hero.getInventory().add(new MagicItem("Bluster2", 15, 5));
        hero.getInventory().add(new MagicItem("Bluster3", 14, 20));
        hero.getInventory().add(new MagicItem("Bluster4", 16, 13));
        hero.getInventory().add(new MagicItem("Bluster5", 6, 14));
        try {
            battleSimulator.simulateBattle(hero, 10);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void simulateBattle(Hero hero, int numTurns) {
        if (hero.getInventory()==null || hero.getInventory().isEmpty()) {
            throw new NoItemsException(hero.getHeroName() + " no have inventary");
        }
        Random rnd = new Random();
        int randomNumber;
        for (int i = 0; i < numTurns; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                randomNumber = rnd.nextInt(hero.getInventory().size());
                hero.useItem(hero.getInventory().get(randomNumber));
            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        }
    }
}
