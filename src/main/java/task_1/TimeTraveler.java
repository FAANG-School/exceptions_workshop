package task_1;

public class TimeTraveler {

	private String name;
	private int birthYear;
	private int deathYear;

	public TimeTraveler(String name, int birthYear, int deathYear) {
		
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Name can't be null or blank");
		}
		
		if (birthYear <= 0 || deathYear <= 0) {
			throw new IllegalArgumentException("Dates must be positive");
		}
		
		if (birthYear > deathYear) {
			throw new IllegalArgumentException("Traveler can't be dead before birthday");
		}
		
		this.name = name;
		this.birthYear = birthYear;
		this.deathYear = deathYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getDeathYear() {
		return deathYear;
	}

	public void setDeathYear(int deathYear) {
		this.deathYear = deathYear;
	}

	@Override
	public String toString() {
		return "TimeTraveler: " + name + ", with birthYear: " + birthYear + ", deathYear: " + deathYear;
	}
	
	

}
