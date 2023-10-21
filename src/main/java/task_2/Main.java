package task_2;

import task_2.enums.CoreMaterial;
import task_2.enums.WoodType;
import task_2.exceptions.NoOrdersException;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        OlivandersShop olivandersShop = new OlivandersShop();

        try {
            olivandersShop.findMostPowerfulWand();
        } catch (NoOrdersException e) {
            System.out.println("Error 1: " + e.getMessage());
        }

        Wand dragonWand = new Wand(WoodType.ACACIA, 1, CoreMaterial.DRAGON_SCALE, 10);
        WandOrder dragonWandOrder = new WandOrder("Ron Weasley", dragonWand, 10);

        Wand phoenixWand = new Wand(WoodType.CEDAR, 1, CoreMaterial.PHOENIX_FEATHER, 20);
        WandOrder phoenixWandOrder = new WandOrder("Harry Potter", phoenixWand, 20);

        try {
            olivandersShop.placeOrder(dragonWandOrder);
            olivandersShop.placeOrder(phoenixWandOrder);
        } catch (RuntimeException e) {
            System.out.println("Error 2: " + e.getMessage());
        }

        WandOrder newPhoenixWandOrder = new WandOrder("Harry Potter", phoenixWand, 1);

        try {
            olivandersShop.placeOrder(newPhoenixWandOrder);
        } catch (RuntimeException e) {
            System.out.println("Error 3: " + e.getMessage());
        }

        Wand mostPowerfulWand = olivandersShop.findMostPowerfulWand();

        System.out.println("Most powerful wand is " + mostPowerfulWand);
    }
}
