package task_2;

public class Wand {

	private String woodType;
	private int length;
	private String coreMaterial;
	private int powerLevel;

	public Wand(String woodType, int length, String coreMaterial, int powerLevel) {

		if (woodType == null || woodType.isBlank() || length <= 0 || length > 20 || coreMaterial == null
				|| coreMaterial.isBlank() || powerLevel <= 0 || powerLevel > 10) {
			throw new IllegalArgumentException("please check wand arguments");
		}
		
		this.woodType = woodType;
		this.length = length;
		this.coreMaterial = coreMaterial;
		this.powerLevel = powerLevel;
	}

	public String getWoodType() {
		return woodType;
	}

	public int getLength() {
		return length;
	}

	public String getCoreMaterial() {
		return coreMaterial;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

}
