package task_1.solution;

public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start(){
        TimeMachine t1 = new TimeMachine(false);
        TimeMachine t2 = new TimeMachine(true);

        TimeTraveler tt1 = new TimeTraveler("Danil", 2001, 2060);
        TimeTraveler tt2 = new TimeTraveler("Vasya", 1980, 2070);
        TimeTraveler tt3 = new TimeTraveler("Petya", 1990, 2050);

        travel(t1, tt1, 2055);
        travel(t2, tt1, 2061);
        travel(t2, tt2, 1700);
        travel(t2, tt3, 2040);
    }

    private void travel(TimeMachine timeMachine, TimeTraveler timeTraveler, int year){
        try {
            timeMachine.traveInTime(timeTraveler, year);
        }catch (TimeTravelException e){
            e.printStackTrace();
        }
    }
}
