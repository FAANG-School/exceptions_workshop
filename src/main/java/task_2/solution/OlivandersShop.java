package task_2.solution;

import task_2.solution.exceptions.NoOrdersException;
import task_2.solution.exceptions.NotEnoughMaterialException;
import task_2.solution.exceptions.NotEnoughWoodException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OlivandersShop {
    private List<WandOrder> orders;
    private Map<String, Integer> woodTypeCount;
    private Map<String, Integer> coreMaterialCount;

    public OlivandersShop() {
        orders = new ArrayList<>();
        woodTypeCount = new HashMap<>();
        coreMaterialCount = new HashMap<>();
    }
    public void placeOrder(WandOrder order) throws NotEnoughMaterialException, NotEnoughWoodException {
        String woodType = order.getWand().getWoodType();
        int requiredWoodCount = order.getQuantity();

        if (woodTypeCount.containsKey(woodType)) {
            int availableWoodCount = woodTypeCount.get(woodType);
            if (availableWoodCount < requiredWoodCount) {
                throw new NotEnoughWoodException(woodType);
            }
            woodTypeCount.put(woodType, availableWoodCount - requiredWoodCount);
        } else {
            throw new NotEnoughWoodException(woodType);
        }

        String coreMaterial = order.getWand().getCoreMaterial();
        int requiredMaterialCount = order.getQuantity();

        if (coreMaterialCount.containsKey(coreMaterial)) {
            int availableMaterialCount = coreMaterialCount.get(coreMaterial);
            if (availableMaterialCount < requiredMaterialCount) {
                throw new NotEnoughMaterialException(coreMaterial);
            }
            coreMaterialCount.put(coreMaterial, availableMaterialCount - requiredMaterialCount);
        } else {
            throw new NotEnoughMaterialException(coreMaterial);
        }

        orders.add(order);
    }
    public Wand findMostPowerfulWand() throws NoOrdersException{
        if (orders.isEmpty()) {
            throw new NoOrdersException("Заказы недоступны");
        }

        Wand mostPowerfulWand = orders.get(0).getWand();
        int maxPowerLevel = mostPowerfulWand.getPowerLevel();

        for (WandOrder order : orders) {
            if (order.getWand().getPowerLevel() > maxPowerLevel) {
                mostPowerfulWand = order.getWand();
                maxPowerLevel = mostPowerfulWand.getPowerLevel();
            }
        }

        return mostPowerfulWand;
    }
}
