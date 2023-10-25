package task_2;

import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        Wand wand = new Wand("dub", 10, "iron", 30);
        WandOrder wandOrder = new WandOrder("Frodo", wand, 3);
        Map<String, Integer> woodTypeCount = new HashMap<>();
        Map<String, Integer> coreMaterialCount = new HashMap<>();
        OlivandersShop olivandersShop = new OlivandersShop(woodTypeCount, coreMaterialCount);
    }
}