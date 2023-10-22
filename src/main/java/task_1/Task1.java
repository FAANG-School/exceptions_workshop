package task_1;

public class Task1 {
    public static void main(String[] args) {
        TimeMachine tm = new TimeMachine(2023,true);
        TimeMachine tmTest = new TimeMachine(202,false);
        TimeTraveler traveler1 = new TimeTraveler("Ignat", 1990, 2100);
        TimeTraveler traveler2 = new TimeTraveler("Jesus", 0, 33);
        TimeTraveler traveler3 = new TimeTraveler("Igor", 1500, 1504);

        try {
            tm.traveInTime(traveler1, 2000);
        } catch (TimeTravelException e) {
            System.out.println(e);
        }

        try {
            tm.traveInTime(traveler2, 4000);
        } catch (TimeTravelException e) {
            System.out.println(e);
        }

        try {
            tm.traveInTime(traveler3, 1300);
        } catch (TimeTravelException e) {
            System.out.println(e);
        }

        try {
            tmTest.traveInTime(traveler2, 200);
        } catch (TimeTravelException e) {
            System.out.println(e);
        }

    }
}
