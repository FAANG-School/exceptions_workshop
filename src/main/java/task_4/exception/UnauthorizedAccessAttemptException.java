package task_4.exception;

public class UnauthorizedAccessAttemptException extends Exception{
    public UnauthorizedAccessAttemptException(String message) {
        super(message);
    }
}
