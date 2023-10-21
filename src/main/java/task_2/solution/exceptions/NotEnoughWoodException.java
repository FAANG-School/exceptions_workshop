package task_2.solution.exceptions;

public class NotEnoughWoodException extends Exception{
    public NotEnoughWoodException(String woodType) {
        super("Недостаточно дерева типа " + woodType + " для изготовления палочек.");
    }
}
