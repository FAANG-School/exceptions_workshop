package task_2;

public class Wand {
    private String woodType;
    private int length;
    private String coreMaterial;
    private int powerLevel;

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        if (woodType.isBlank()) {
            throw new IllegalArgumentException("Тип дерева должен быть не пустым");
        }
        this.woodType = woodType;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=0) {
            throw new IllegalArgumentException("Длина палочки не должна быть равна или меньше нуля");
        }
        this.length = length;
    }

    public String getCoreMaterial() {
        return coreMaterial;
    }

    public void setCoreMaterial(String coreMaterial) {
        if (woodType.isBlank()) {
            throw new IllegalArgumentException("Материал сердца должен быть не пустым");
        }
        this.coreMaterial = coreMaterial;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        if (length<=0) {
            throw new IllegalArgumentException("Мощность палочки не должна быть равна или меньше нуля");
        }
        this.powerLevel = powerLevel;
    }


}
