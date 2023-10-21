package task_1;

public class Main {
    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine(2023, false);

        TimeTraveler traveler = new TimeTraveler("John", 1980, 2070);

        try {
            // Test scenario 3: Attempt to travel when the time machine is not working
            timeMachine.travelInTime(traveler, 2040);
        } catch (TimeTravelException e) {
            System.out.println("Error 1: " + e.getMessage());
        }

        // Repair the time machine to make it work
        timeMachine.repair();

        try {
            // Test scenario 1: Attempt to travel to a year before the traveler's birth year
            timeMachine.travelInTime(traveler, 1975);
        } catch (TimeTravelException e) {
            System.out.println("Error 2: " + e.getMessage());
        }

        try {
            // Test scenario 2: Attempt to travel to a year beyond the traveler's death year
            timeMachine.travelInTime(traveler, 2080);
        } catch (TimeTravelException e) {
            System.out.println("Error 3: " + e.getMessage());
        }

        try {
            // Test scenario 4: Successful time travel to the year 2050
            timeMachine.travelInTime(traveler, 2050);
            System.out.println("Current year in the time machine: " + timeMachine.getCurrentYear());
        } catch (TimeTravelException e) {
            System.out.println("Error 4: " + e.getMessage());
        }
    }
}