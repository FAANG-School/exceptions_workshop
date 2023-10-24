package task_1;
public class TimeMachine {

    int currentYear;
    boolean isWorking;

    public TimeMachine(int currentYear, boolean isWorking) {
        this.currentYear = currentYear;
        this.isWorking = isWorking;
    }

    void travelInTime(TimeTraveler timeTraveler, int travelYear) throws TimeTravelException {
        if(!isWorking) {
            throw new TimeTravelException("mach");
        }
        if(currentYear < timeTraveler.birthYear) {
            throw new TimeTravelException("you're not born yet");
        }
        if(currentYear > timeTraveler.deathYear) {
            throw new TimeTravelException("you're already dead");
        } else {
            System.out.println("go go go");
        }
    }
}
