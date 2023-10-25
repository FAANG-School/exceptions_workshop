package task_1;

import java.util.Date;

public class TimeTraveler {
    private String name;
    private int birthYear;
    private int dearthYear;

    public TimeTraveler(String name, int birthYear, int dearthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.dearthYear = dearthYear;
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

    public int getDearthYear() {
        return dearthYear;
    }

    public void setDearthYear(int dearthYear) {
        this.dearthYear = dearthYear;
    }
}
