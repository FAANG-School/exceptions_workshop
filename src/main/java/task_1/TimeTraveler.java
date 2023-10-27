package task_1;
public class TimeTraveler {
    String name;
    static int birthYear;
    int deathYear;

    public TimeTraveler(String name, int birthYear, int deathYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }
    public static int getBirthYear(){
        return birthYear;
    }
}
