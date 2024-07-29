package task_1.solution;

import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class TimeMachine {
    private int currentYear = Calendar.getInstance().getWeekYear();

    private boolean isWorking;

    public TimeMachine( boolean isWorking) {
        this.isWorking = isWorking;
    }

    public void traveInTime (TimeTraveler traveler, int year) throws TimeTravelException{
        if(!isWorking)
            throw new TimeTravelException("Time machine not working now!");

        if(traveler.getBirthYear()>year || traveler.getDeathYear()<year)
            throw new TimeTravelException("Error travel in this year!");

        System.out.println(traveler.getName()+" successful travel in "+year);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public boolean isWorking() {
        return isWorking;
    }
}
