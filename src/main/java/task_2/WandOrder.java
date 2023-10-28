package task_2;

public class WandOrder {

    private final String customerName;
    private Wand wand;
    private int quantity;

    public WandOrder(String customerName, Wand wand, int quantity) {
        if (customerName.isEmpty()) {
            throw new IllegalArgumentException("The \"customerName\" field should not be empty!");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("The \"quantity\" field should not be <= 0!");
        }
        this.customerName = customerName;
        this.wand = wand;
        this.quantity = quantity;
    }

    public Wand getWand() {
        return wand;
    }

    public int getQuantity() {
        return quantity;
    }
}
