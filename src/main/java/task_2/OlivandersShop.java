package task_2;

import java.util.Map;

public class OlivandersShop{
    Map<String, Integer> woodTypeCount;
    Map<String, Integer> coreMaterialCount;

    public OlivandersShop(Map<String, Integer> woodTypeCount) {
        this.woodTypeCount = woodTypeCount;
    }

    public void placeOrder(WandOrder order){};
    public Wand findMostPowerfulWand() {
        return null;
    };
}