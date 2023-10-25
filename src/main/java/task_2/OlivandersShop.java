package task_2;

import java.util.Map;

public class OlivandersShop{
    Map<String, Integer> woodTypeCount;
    Map<String, Integer> coreMaterialCount;

    public OlivandersShop(Map<String, Integer> woodTypeCount, Map<String, Integer> coreMaterialCount) {
        this.woodTypeCount = woodTypeCount;
        this.coreMaterialCount = coreMaterialCount;
    }

    public void placeOrder(WandOrder order){};
    public Wand findMostPowerfulWand() {
        return null;
    };

    void makeOrder(WandOrder wandOrder, Wand wand){
        if(wandOrder.quantity < MapExample.getKeyByValue(woodTypeCount, 5)){};
    }
}
