package task_5.solution;

import task_5.exception.BattleException;
import task_5.exception.NoItemsException;

import java.util.Random;

public class BattleSimulator {
    public void simulateBattle(Hero2 hero, int numTurns) throws NoItemsException {
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
