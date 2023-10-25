package task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OlivandersShop {
    List<WandOrder> orders = new ArrayList<>();
    private Map<String, Integer> woodTypeCount;
    private Map<String, Integer> coreMaterialCount;

    public OlivandersShop(Map<String, Integer> woodTypeCount, Map<String, Integer> coreMaterialCount) {
        this.woodTypeCount = woodTypeCount;
        this.coreMaterialCount = coreMaterialCount;
    }

    public void placeOrder(WandOrder order) throws NotEnoughWoodException {
        String woodType = order.getWand().getWoodType();
        Integer woodTypeCnt = woodTypeCount.get(woodType);
        if (woodTypeCnt == null || woodTypeCnt < order.getQuantity()) {
            throw new NotEnoughWoodException(woodType);
        }
        String coreMaterial = order.getWand().getCoreMaterial();
        Integer coreMaterialCnt = coreMaterialCount.get(coreMaterial);
        if (coreMaterialCnt == null || coreMaterialCnt < order.getQuantity()) {
            throw new NotEnoughMaterialException(woodType);
        }
        woodTypeCount.put(woodType, woodTypeCnt - order.getQuantity());
        coreMaterialCount.put(coreMaterial, coreMaterialCnt - order.getQuantity());
        orders.add(order);
    }

    public Wand findMostPowerfulWand() throws OrdersListIsEmptyException {
        if (orders.isEmpty()) {
            throw new OrdersListIsEmptyException("Список заказов пуст");
        }
        WandOrder maxQualityWand = new WandOrder();
        for (WandOrder order : orders) {
            if (order.getQuantity() > maxQualityWand.getQuantity()) {
                maxQualityWand = order;
            }
        }
        return maxQualityWand.getWand();
    }
}
