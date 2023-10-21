package task_2.solution.exceptions;

public class NotEnoughMaterialException extends Exception{
    public NotEnoughMaterialException(String material) {
        super("Недостаточно материала для сердца палочки: " + material);
    }
}
