package task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OlivandersShop {

    private Map<String, Integer> woodTypeCount;
    private Map<String, Integer> coreMaterialCount;
    private List<WandOrder> orders = new ArrayList<>();

    public Map<String, Integer> getWoodTypeCount() {
        return woodTypeCount;
    }

    public Map<String, Integer> getCoreMaterialCount() {
        return coreMaterialCount;
    }

    public void setWoodTypeCount(Map<String, Integer> woodTypeCount) {
        this.woodTypeCount = woodTypeCount;
    }

    public void setCoreMaterialCount(Map<String, Integer> coreMaterialCount) {
        this.coreMaterialCount = coreMaterialCount;
    }

    public void placeOrder(WandOrder order) {
        String woodType = order.getWand().getWoodType();
        String coreMaterial = order.getWand().getCoreMaterial();

        for (Map.Entry<String, Integer> woodTypeCnt : woodTypeCount.entrySet()) {
            if (woodTypeCnt.getKey().equals(woodType)) {
                if (woodTypeCnt.getValue() >= order.getQuantity()) {
                    for (Map.Entry<String, Integer> coreMaterialCnt : coreMaterialCount.entrySet()) {
                        if (coreMaterialCnt.getKey().equals(coreMaterial)) {
                            if (coreMaterialCnt.getValue() >= order.getQuantity()) {
                                orders.add(order);
                            } else {
                                throw new NotEnoughMaterialException(coreMaterial);
                            }
                        }
                    }
                } else {
                    throw new NotEnoughWoodException(woodType);
                }
            }
        }
    }

    public Wand findMostPowerfulWand() {
        if (orders.isEmpty()) {
            throw new OrdersListIsEmptyException();
        }
        Wand mostPowerfulWand = orders.get(0).getWand();
        for (WandOrder wandOrder : orders) {
            if (wandOrder.getWand().getPowerLevel() > mostPowerfulWand.getPowerLevel()) {
                mostPowerfulWand = wandOrder.getWand();
            }
        }
        return mostPowerfulWand;
    }

    public static void main(String[] args) {
        OlivandersShop olivandersShop = new OlivandersShop();

        olivandersShop.setWoodTypeCount(new HashMap<>());

        olivandersShop.getWoodTypeCount().put("Acacia", 30);
        olivandersShop.getWoodTypeCount().put("Beech", 25);
        olivandersShop.getWoodTypeCount().put("Elder", 40);
        olivandersShop.getWoodTypeCount().put("Vine", 10);
        olivandersShop.getWoodTypeCount().put("Willow", 15);
        olivandersShop.getWoodTypeCount().put("Cedar", 35);
        olivandersShop.getWoodTypeCount().put("Yew", 20);

        olivandersShop.setCoreMaterialCount(new HashMap<>());

        olivandersShop.getCoreMaterialCount().put("Phoenix feather", 30);
        olivandersShop.getCoreMaterialCount().put("Thestral tail hair", 40);
        olivandersShop.getCoreMaterialCount().put("Unicorn hair", 25);
        olivandersShop.getCoreMaterialCount().put("Dragon heartstring", 10);

        Wand wandOne = new Wand("Acacia", 15.3, "Unicorn hair", 100);
        Wand wandTwo = new Wand("Cedar", 13.8, "Thestral tail hair", 150);
        Wand wandThree = new Wand("Willow", 14.8, "Dragon heartstring", 90);

        WandOrder wandOrderOne = new WandOrder("CustomerOne", wandOne, 10);
        WandOrder wandOrderTwo = new WandOrder("CustomerOne", wandTwo, 20);
        WandOrder wandOrderThree = new WandOrder("CustomerTwo", wandTwo, 5);
        WandOrder wandOrderFour = new WandOrder("CustomerTwo", wandThree, 9);

        olivandersShop.placeOrder(wandOrderOne);
        olivandersShop.placeOrder(wandOrderTwo);
        olivandersShop.placeOrder(wandOrderThree);
        olivandersShop.placeOrder(wandOrderFour);

        System.out.println(olivandersShop.findMostPowerfulWand());
    }
}