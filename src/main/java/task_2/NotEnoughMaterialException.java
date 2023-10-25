package task_2;

public class NotEnoughMaterialException extends RuntimeException{
    public NotEnoughMaterialException(String message) {
        super(message);
    }
}
