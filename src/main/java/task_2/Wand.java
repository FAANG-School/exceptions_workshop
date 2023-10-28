package task_2;

public class Wand {

    private String woodType;
    private double length;
    private String coreMaterial;
    private int powerLevel;

    public Wand(String woodType, double length, String coreMaterial, int powerLevel) {
        if (woodType.isEmpty()) {
            throw new IllegalArgumentException("The \"woodType\" field should not be empty!");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("The \"length\" field should not be <= 0!");
        }
        if (coreMaterial.isEmpty()) {
            throw new IllegalArgumentException("The \"coreMaterial\" field should not be empty!");
        }
        if (powerLevel <= 0) {
            throw new IllegalArgumentException("The \"powerLevel\" field should not be <= 0!");
        }
        this.woodType = woodType;
        this.length = length;
        this.coreMaterial = coreMaterial;
        this.powerLevel = powerLevel;

    }

    public String getWoodType() {
        return woodType;
    }

    public String getCoreMaterial() {
        return coreMaterial;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public String toString() {
        return "Wand [" + "woodType: " + woodType + "; length: " + length + "; coreMaterial: " +
                coreMaterial + "; powerLevel: " + powerLevel + "].";
    }
}
