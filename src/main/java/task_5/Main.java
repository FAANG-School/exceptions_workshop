package task_5;

import task_5.exceptions.NoItemsException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NoItemsException {
        MagicItem item1 = new MagicItem("Заклинание огня", 50, 10);
        MagicItem item2 = new MagicItem("Исцеляющее зелье", 30, 5);
        MagicItem item3 = new MagicItem("Замораживающий предмет", 70, 15);

        Hero hero = new Hero("Герой", 100, new ArrayList<>());
        hero.addItemToInventory(item1);
        hero.addItemToInventory(item2);
        hero.addItemToInventory(item3);

        BattleSimulator simulator = new BattleSimulator();
        simulator.simulateBattle(hero, 10);
    }
}
