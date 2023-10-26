package task_4;

public class UnauthorizedAccessAttemptException extends RuntimeException{
    public UnauthorizedAccessAttemptException(String message) {
        super(message);
    }
}
