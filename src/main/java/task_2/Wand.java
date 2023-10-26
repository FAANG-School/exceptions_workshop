package task_2;

public class Wand{
    String woodType;
    int length;
    String coreMaterial;
    int powerLevel;



    public Wand(String woodType, int length, String coreMaterial, int powerLevel) throws IllegalAccessException {
        this.woodType = woodType;
        if (woodType == null) throw new IllegalArgumentException ("Wood type must be not null");
        this.length = length;
        if (length <= 0) throw new IllegalArgumentException("lenght is " + length);
        this.coreMaterial = coreMaterial;
        if (coreMaterial == null) throw new IllegalArgumentException ("coreMaterial type must be not null");
        this.powerLevel = powerLevel;
        if (powerLevel <= 0) throw new IllegalArgumentException("powerLevel is " + powerLevel);
    }
}
