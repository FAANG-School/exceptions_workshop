package task_2;


import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) throws NotEnoughWoodException, NotEnoughMaterialException, IllegalAccessException {

        Wand wand1 = new Wand("dub", 10, "iron", 32); //создание экземпляра палки
        Wand wand2 = new Wand("buk", 12, "carbon", 13); //создание экземпляра палки

        HashMap<String, Integer> woodTypeCount = new HashMap<>(); //наполнение будущего экземпляра магаза
        HashMap<String, Integer> coreMaterialCount = new HashMap<>();
        woodTypeCount.put("dub", 5);
        woodTypeCount.put("buk", 5);
        coreMaterialCount.put("iron", 5);
        coreMaterialCount.put("carbon", 5);

        OlivandersShop olivandersShop1 = new OlivandersShop(woodTypeCount, coreMaterialCount); //создание экземпляра1 магаза
//        OlivandersShop olivandersShop2 = new OlivandersShop(woodTypeCount, coreMaterialCount); //создание экземпляра2 магаза

        WandOrder wandOrder1 = new WandOrder("Frodo", wand1, 5); //создание экземпляра1 заказа
        WandOrder wandOrder2 = new WandOrder("Sam", wand2, 5); //создание экземпляра2 заказа

        try{
            olivandersShop1.placeOrder(wandOrder1);}
        catch (Exception e) {
            throw new NotEnoughWoodException(e.getMessage());
        }

        try{
            olivandersShop1.placeOrder(wandOrder2);}
        catch (Exception e) {
            throw new NotEnoughWoodException(e.getMessage());
        }

        olivandersShop1.findMostPowerfulWand();
    }
}