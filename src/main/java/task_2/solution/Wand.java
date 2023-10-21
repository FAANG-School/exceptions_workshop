package task_2.solution;

import task_2.solution.exceptions.NotEnoughMaterialException;
import task_2.solution.exceptions.NotEnoughWoodException;

public class Wand {
    private String woodType;
    private double length;
    private String coreMaterial;
    private int powerLevel;

    public Wand(String woodType, int length, String coreMaterial, int powerLevel) throws NotEnoughWoodException,
            NotEnoughMaterialException {
        if (woodType == null || woodType.isEmpty()) {
            throw new NotEnoughWoodException("Тип дерева не может быть пустым");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Длина должна быть больше 0");
        }
        if (coreMaterial == null || coreMaterial.isEmpty()) {
            throw new NotEnoughMaterialException("Материал не может быть пустым");
        }
        if (powerLevel <= 0) {
            throw new IllegalArgumentException("Уровень мощности должен быть больше 0");
        }
        this.woodType = woodType;
        this.length = length;
        this.coreMaterial = coreMaterial;
        this.powerLevel = powerLevel;
    }

    public String getWoodType() {
        return woodType;
    }

    public double getLength() {
        return length;
    }

    public String getCoreMaterial() {
        return coreMaterial;
    }

    public int getPowerLevel() {
        return powerLevel;
    }
}
