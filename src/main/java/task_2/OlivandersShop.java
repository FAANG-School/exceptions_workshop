package task_2;

import java.util.Map;

public class OlivandersShop{
    Map<String, Integer> woodTypeCount;
    Map<String, Integer> coreMaterialCount;

    public OlivandersShop(Map<String, Integer> woodTypeCount, Map<String, Integer> coreMaterialCount) {
        this.woodTypeCount = woodTypeCount;
        this.coreMaterialCount = coreMaterialCount;
    }

    public void placeOrder(WandOrder order) {
        if(order.quantity > woodTypeCount.get(order.wand.woodType))
        {System.out.println("not enough");}
        else {System.out.println("enough");}
//        System.out.println(woodTypeCount.get("iron"));
    };
    public Wand findMostPowerfulWand() {
        return null;
    };

    void makeOrder(WandOrder wandOrder, Wand wand){
        System.out.println("aaaaaaaaaaaaaaanus");
        if(wandOrder.quantity < woodTypeCount.get(wand.coreMaterial))
        {System.out.println("aaaaaaaaaaaaaaanus");}

    }
}
