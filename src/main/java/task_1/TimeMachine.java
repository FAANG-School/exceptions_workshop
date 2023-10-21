package task_1;

public class TimeMachine {
    private int currentYear;

    private boolean isWorking;

    public TimeMachine(int currentYear, boolean isWorking) {
        this.currentYear = currentYear;
        this.isWorking = isWorking;
    }

    public void travelInTime(TimeTraveler traveler, int yearToTravel) {
        if (!isWorking) {
            throw new TimeTravelException("The time machine is not working.");
        }

        if (yearToTravel < traveler.getBirthYear()) {
            throw new TimeTravelException("Cannot travel to a year before the traveler's birth year.");
        }

        if (yearToTravel > traveler.getDeathYear()) {
            throw new TimeTravelException("Cannot travel to a year beyond the traveler's death year.");
        }

        // If all checks pass, perform the time travel
        currentYear = yearToTravel;
        System.out.println(traveler.getName() + " traveled to the year " + yearToTravel);

    }

    public int getCurrentYear() {
        return currentYear;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void repair() {
        isWorking = true;
    }
}