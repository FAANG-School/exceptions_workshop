package task_2;


import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) throws NotEnoughWoodException {

        Wand wand = new Wand("dub", 10, "iron", 30); //создание экземпляра палки

        Map<String, Integer> woodTypeCount = new HashMap<>(); //наполнение будущего экземпляра магаза
        Map<String, Integer> coreMaterialCount = new HashMap<>();
        woodTypeCount.put("dub", 5);
        woodTypeCount.put("buk", 3);
        coreMaterialCount.put("iron", 4);
        coreMaterialCount.put("carbon", 5);

        OlivandersShop olivandersShop = new OlivandersShop(woodTypeCount, coreMaterialCount); //создание экземпляра магаза

        WandOrder wandOrder = new WandOrder("Frodo", wand, 3); //создание экземпляра заказа

        System.out.println(MapExample.getKeyByValue(woodTypeCount, 5));
//        try{
//
//        catch (Exception e) {
//            throw new NotEnoughWoodException(e.getMessage());
//        }
    }
}