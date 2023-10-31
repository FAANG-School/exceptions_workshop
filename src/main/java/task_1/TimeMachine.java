package task_1;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class TimeMachine {
    private int currentYear;
    private boolean isWorking;

    public static void main(String[] args) {
        TimeTraveler timeTraveler1 = new TimeTraveler("Ivan1", 1983, 2080);
        TimeTraveler timeTraveler2 = new TimeTraveler("Ivan2", 2000, 2090);
        TimeTraveler timeTraveler3 = new TimeTraveler("Ivan3", 1995, 2100);
        TimeMachine timeMachine = new TimeMachine();
        timeMachine.isWorking = true;
        timeMachine.traveInItemWithCatch(timeTraveler1, 2000);
        timeMachine.traveInItemWithCatch(timeTraveler2, 1999);
        timeMachine.traveInItemWithCatch(timeTraveler3, 2101);
        timeMachine.traveInItemWithCatch(timeTraveler1, 2100);
    }

    private void traveInItemWithCatch(TimeTraveler timeTraveler, int year) {
        try {
            traveInTime(timeTraveler, year);
        } catch (TimeTravelException e) {
            log.info(e.getStackTrace());
        }
    }

    public void traveInTime(TimeTraveler timeTraveler, int year) {
        if (!isWorking) {
            throw new TimeTravelException("Machine is not working");
        }
        if (year < timeTraveler.getBirthYear()) {
            throw new TimeTravelException("Trave in " + year + " year were traveler not birth. BirthDay - " + timeTraveler.getBirthYear());
        }
        if (year > timeTraveler.getDearthYear()) {
            throw new TimeTravelException("Trave in " + year + " year were traveler is dead. DeathDay - " + timeTraveler.getDearthYear());
        }
        System.out.println("Trave " + timeTraveler.getName() + "to " + year + " year");
    }
}
