package task_1;

public class TimeTravelException extends Exception {

    private String s;

    public TimeTravelException(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
