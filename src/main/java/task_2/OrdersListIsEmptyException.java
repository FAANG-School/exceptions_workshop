package task_2;

public class OrdersListIsEmptyException extends RuntimeException {
    public OrdersListIsEmptyException() {
        super("The list of orders is empty!");
    }
}
