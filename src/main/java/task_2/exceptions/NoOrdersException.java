package task_2.exceptions;

public class NoOrdersException extends RuntimeException {
    public NoOrdersException() {
        super("Orders list is empty");
    }
}
