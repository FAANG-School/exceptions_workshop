package task_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero("Invoker", 250);
        hero.addItemToInventory(new MagicItem("Blink Dagger", 75, 5));
        hero.addItemToInventory(new MagicItem("Hand of Midas", 150, 10));

        BattleSimulator simulator = new BattleSimulator();
        simulator.simulateBattle(hero, 5);
    }
}
