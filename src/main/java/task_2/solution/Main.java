package task_2.solution;

import task_2.solution.exceptions.NoOrdersException;
import task_2.solution.exceptions.NotEnoughMaterialException;
import task_2.solution.exceptions.NotEnoughWoodException;

public class Main {
    public static void main(String[] args) {
        try {
            Wand wand1 = new Wand("Дуб", 12, "-", 10);
            WandOrder order1 = new WandOrder("Петр", wand1, 3);

            Wand wand2 = new Wand("Ель", 11, "-", 12);
            WandOrder order2 = new WandOrder("Шавкат", wand2, 2);

            OlivandersShop olivanders = new OlivandersShop();
            olivanders.placeOrder(order1);
            olivanders.placeOrder(order2);

            Wand mostPowerfulWand = olivanders.findMostPowerfulWand();
            System.out.println("Самая сильная палочка : " + mostPowerfulWand.getWoodType() + " " + mostPowerfulWand.getCoreMaterial());
        } catch (NotEnoughWoodException | NotEnoughMaterialException | NoOrdersException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
