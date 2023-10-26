package task_2;

public class Wand {
    private String woodType;
    private int length;
    private String coreMaterial;
    private int powerLevel;

    public Wand(String woodType, int length, String coreMaterial, int powerLevel) {
        this.woodType = woodType;
        this.length = length;
        this.coreMaterial = coreMaterial;
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return "Wand{" +
                "woodType='" + woodType + '\'' +
                ", length=" + length +
                ", coreMaterial='" + coreMaterial + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        if (woodType.isBlank()) {
            throw new IllegalArgumentException("wood type not be empty");
        }
        this.woodType = woodType;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("wand length must be ,ore than 0");
        }
        this.length = length;
    }

    public String getCoreMaterial() {
        return coreMaterial;
    }

    public void setCoreMaterial(String coreMaterial) {
        if (woodType.isBlank()) {
            throw new IllegalArgumentException("core material type not be empty");
        }
        this.coreMaterial = coreMaterial;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        if (length <= 0) {
            throw new IllegalArgumentException("wand power must be ,ore than 0");
        }
        this.powerLevel = powerLevel;
    }


}
