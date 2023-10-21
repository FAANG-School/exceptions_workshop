package task_1;

public class TimeTraveler {
    private String name;

    private int birthYear;

    private int deathYear;

    public TimeTraveler() {
    }

    public TimeTraveler(String name, int birthYear, int deathYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }
}