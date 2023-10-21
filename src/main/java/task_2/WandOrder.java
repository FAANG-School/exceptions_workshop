package task_2;

public class WandOrder {

    private String customerName;

    private Wand wand;

    private int quantity;

    public WandOrder(String customerName, Wand wand, int quantity) {
        if (customerName != null) {
            this.customerName = customerName;
        } else {
            throw new IllegalArgumentException("Customer name can not be null");
        }

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity must be greater zero");
        }

        this.wand = wand;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Wand getWand() {
        return wand;
    }

    public int getQuantity() {
        return quantity;
    }
}
