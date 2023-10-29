package task_5;

import task_5.exceptions.BattleException;
import task_5.exceptions.NoItemsException;

import java.util.Random;

public class BattleSimulator {
    public void simulateBattle(Hero hero, int numTurns) throws NoItemsException {
        for (int i = 0; i < numTurns; i++) {
            try {
                if (hero.inventory.isEmpty()) {
                    throw new NoItemsException("У героя нет предметов для использования.");
                }
                MagicItem randomItem = hero.inventory.get(new Random().nextInt(hero.inventory.size()));
                hero.useItem(randomItem);
            } catch (BattleException exp) {
                System.out.println(exp.getMessage());
            }
        }
    }
}
