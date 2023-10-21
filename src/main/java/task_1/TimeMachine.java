package task_1;

public class TimeMachine {

    private int currentYear;
    private boolean isWorking;

    public TimeMachine(int currentYear, boolean isWorking) {
        this.currentYear = currentYear;
        this.isWorking = isWorking;
    }

    public void travelInTime(TimeTraveler timeTraveler, int yearInTheFuture) throws TimeTravelException {
        if (!isWorking) {
            throw new TimeTravelException("The time machine is not working at the moment!");
        }
        if (yearInTheFuture < timeTraveler.getBirthYear()) {
            throw new TimeTravelException("The traveler has not yet been born!");
        }
        if (yearInTheFuture > timeTraveler.getDeathYear()) {
            throw new TimeTravelException("The traveler has already died!");
        }
        System.out.println("The trip was successful! The traveler " + timeTraveler.getName() + " is in " + yearInTheFuture + ".");
    }

    public static void trip(TimeMachine timeMachine, TimeTraveler timeTraveler) {
        try {
            timeMachine.travelInTime(timeTraveler, 2070);
        } catch (TimeTravelException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        TimeMachine timeMachineOne = new TimeMachine(2023, true);
        TimeMachine timeMachineTwo = new TimeMachine(2000, false);

        TimeTraveler timeTravelerOne = new TimeTraveler("Alex", 1996, 2060);
        TimeTraveler timeTravelerTwo = new TimeTraveler("Mike", 2025, 2080);
        TimeTraveler timeTravelerThree = new TimeTraveler("Kate", 2080, 2150);

        trip(timeMachineOne, timeTravelerOne);
        trip(timeMachineOne, timeTravelerTwo);
        trip(timeMachineOne, timeTravelerThree);

        trip(timeMachineTwo, timeTravelerOne);
    }
}