package task_2;

import task_2.enums.CoreMaterial;
import task_2.enums.WoodType;

public class Wand {

    private WoodType woodType;

    private int length;

    private CoreMaterial coreMaterial;

    private int powerLevel;

    public Wand(WoodType woodType, int length, CoreMaterial coreMaterial, int powerLevel) {
        if (woodType != null) {
            this.woodType = woodType;
        } else {
            throw new IllegalArgumentException("Wood type can not bo null");
        }

        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be greater zero");
        }

        if (coreMaterial != null) {
            this.coreMaterial = coreMaterial;
        } else {
            throw new IllegalArgumentException("Core material can not be null");
        }

        if (powerLevel > 0) {
            this.powerLevel = powerLevel;
        } else {
            throw new IllegalArgumentException("Power level must be greater zero");
        }
    }

    public WoodType getWoodType() {
        return woodType;
    }

    public int getLength() {
        return length;
    }

    public CoreMaterial getCoreMaterial() {
        return coreMaterial;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public String toString() {
        return "Wand{" +
                "woodType=" + woodType +
                ", length=" + length +
                ", coreMaterial=" + coreMaterial +
                ", powerLevel=" + powerLevel +
                '}';
    }
}
