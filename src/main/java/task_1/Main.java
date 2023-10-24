package task_1;

public class Main{
    public static void main(String[] args) throws TimeTravelException {
        TimeTraveler timeTraveler = new TimeTraveler("Petr", 1960, 2020);
        TimeMachine timeMachine = new TimeMachine(2020, true);

        try{
        timeMachine.travelInTime(timeTraveler, 2001);}
        catch (Exception e){
            throw new TimeTravelException(e.getMessage());
        }
    }
}