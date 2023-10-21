package task_1.solution;

public class Main {
    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine(2023);

        TimeTraveler traveler1 = new TimeTraveler("Travis", 1990, 2100);
        TimeTraveler traveler2 = new TimeTraveler("Ja", 1985, 2050);

        try {
            timeMachine.travelInTime(traveler1, 2000);
            timeMachine.travelInTime(traveler2, 2075);
        } catch (TimeTravelException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
