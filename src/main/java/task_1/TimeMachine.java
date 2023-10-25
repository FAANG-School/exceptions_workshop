package task_1;

import java.util.Date;

public class TimeMachine {
    private int currentYear;
    private boolean isWorking;

    public static void main(String[] args) {
        TimeTraveler timeTraveler1 = new TimeTraveler("Ivan1", 1983, 2080);
        TimeTraveler timeTraveler2 = new TimeTraveler("Ivan2", 2000, 2090);
        TimeTraveler timeTraveler3 = new TimeTraveler("Ivan3", 1995, 2100);
        TimeMachine timeMachine = new TimeMachine();
        timeMachine.isWorking=true;
        timeMachine.traveInTime(timeTraveler1, 2000);
       // timeMachine.traveInTime(timeTraveler2, 1999);
       // timeMachine.traveInTime(timeTraveler3, 2101);
      //  timeMachine.traveInTime(timeTraveler1, 2100);
    }
    public void traveInTime(TimeTraveler timeTraveler, int year) {
        if (!isWorking) {
            throw new TimeTravelException("Machine is not working");
        }
        if (year<timeTraveler.getBirthYear()) {
            throw new TimeTravelException("Trave in year were traveler not birth");
        }
        if (year>timeTraveler.getDearthYear()) {
            throw new TimeTravelException("Trave in year were traveler is dead");
        }
        System.out.println("Trave " + timeTraveler.getName() + "to " + year + " year");
    }
}
