package task_2;

import task_2.enums.CoreMaterial;
import task_2.enums.WoodType;
import task_2.exceptions.NoOrdersException;
import task_2.exceptions.NotEnoughMaterialException;
import task_2.exceptions.NotEnoughWoodException;

import java.util.*;

public class OlivandersShop {

    private Map<WoodType, Integer> woodTypeCount;

    private Map<CoreMaterial, Integer> coreMaterialCount;

    private List<WandOrder> wandOrders;

    public OlivandersShop() {
        this.wandOrders = new ArrayList<>();
        this.woodTypeCount = new HashMap<>();
        this.coreMaterialCount = new HashMap<>();

        int i = 10;
        CoreMaterial[] coreMaterials = CoreMaterial.values();
        for (CoreMaterial material : coreMaterials) {
            coreMaterialCount.put(material, i++);
        }

        WoodType[] woodTypes = WoodType.values();
        i = 10;
        for (WoodType woodType : woodTypes) {
            woodTypeCount.put(woodType, i+=2);
        }
    }

    public void placeOrder(WandOrder order) {
        WoodType woodType = order.getWand().getWoodType();
        CoreMaterial coreMaterial = order.getWand().getCoreMaterial();

        Integer woodTypeCnt = woodTypeCount.get(woodType);
        Integer coreMaterialCnt = coreMaterialCount.get(coreMaterial);

        if(woodTypeCnt == null || woodTypeCnt < order.getQuantity()){
            throw new NotEnoughWoodException(woodType);
        }
        if(coreMaterialCnt == null || coreMaterialCnt < order.getQuantity()){
            throw new NotEnoughMaterialException(coreMaterial);
        }

        wandOrders.add(order);
        woodTypeCount.put(woodType, woodTypeCnt - order.getQuantity());
        coreMaterialCount.put(coreMaterial, coreMaterialCnt - order.getQuantity());
    }

    public Wand findMostPowerfulWand() {
        if(wandOrders.isEmpty()) {
            throw new NoOrdersException();
        }

        return wandOrders.stream()
                .max(Comparator.comparingInt(order -> order.getWand().getPowerLevel()))
                .map(WandOrder::getWand)
                .orElse(null);
    }
}
