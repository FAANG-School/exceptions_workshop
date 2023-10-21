package task_5;

import task_5.exceptions.BattleException;

import java.util.concurrent.TimeUnit;

public class BattleSimulator {
    public void simulateBattle(Hero hero, int numTurns) throws InterruptedException {
        for (int turn = 0; turn < numTurns; turn++) {
            System.out.println("Turn " + turn + ": " + hero.getHeroName() + " is trying to use items...");
            try {
                hero.useItem();
            } catch (BattleException e) {
                System.out.println("BattleException: " + e.getMessage());
            }
            System.out.println("Mana remaining: " + hero.getCurrentMana());
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
