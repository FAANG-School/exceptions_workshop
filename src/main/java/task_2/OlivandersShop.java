package task_2;


import java.util.Map;

public class OlivandersShop{
    Map<String, Integer> woodTypeCount;
    Map<String, Integer> coreMaterialCount;

    public OlivandersShop(Map<String, Integer> woodTypeCount, Map<String, Integer> coreMaterialCount) {
        this.woodTypeCount = woodTypeCount;
        this.coreMaterialCount = coreMaterialCount;
    }

    public void placeOrder(WandOrder order) throws NotEnoughMaterialException {
        if(order.quantity > woodTypeCount.get(order.wand.woodType)) {
            throw new NotEnoughMaterialException("нужно больше дерева");}
        if(order.quantity > coreMaterialCount.get(order.wand.coreMaterial)) {
            throw new NotEnoughMaterialException("нужно больше наполнителя");}
        else {System.out.println("твой заказ выполнен");}
    };
    public Wand findMostPowerfulWand() {
        return null;
    };
}
