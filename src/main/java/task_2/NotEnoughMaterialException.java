package task_2;

public class NotEnoughMaterialException extends RuntimeException {
    public NotEnoughMaterialException(String coreMaterial) {
        super("There is not enough \"" + coreMaterial + "\" for the production of sticks.");
    }
}
