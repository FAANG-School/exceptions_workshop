package task_2;

public class NotEnoughWoodException extends RuntimeException {
    public NotEnoughWoodException(String woodType) {
        super("There is not enough \"" + woodType + "\" for the production of sticks!");
    }
}
