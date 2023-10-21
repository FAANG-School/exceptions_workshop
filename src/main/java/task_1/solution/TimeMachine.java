package task_1.solution;

public class TimeMachine {
    private int currentYear;
    private boolean isWorking;

    public TimeMachine(int currentYear) {
        this.currentYear = currentYear;
        this.isWorking = true;
    }

    public void travelInTime(TimeTraveler timeTraveler, int year) throws TimeTravelException {
        if (!isWorking) {
            throw new TimeTravelException("The time machine is not working at the moment.");
        }

        if (year < timeTraveler.getBirthYear()) {
            throw new TimeTravelException("The year of travel to the past is less than the year of the traveler's " +
                    "birth.");
        }

        if (year > timeTraveler.getDeathYear()) {
            throw new TimeTravelException("The year of the travel into the future is longer than the year of the " +
                    "traveler's death.");
        }

        System.out.println(timeTraveler.getName() + " travels through time in " + year + " year.");
    }
}
