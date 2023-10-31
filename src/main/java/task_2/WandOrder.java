package task_2;

public class WandOrder {
    private String customerName;
    private Wand wand;
    private int quantity;

    public WandOrder() {
    }

    public WandOrder(String customerName, Wand wand, int quantity) {
        setCustomerName(customerName);
        setWand(wand);
        setQuantity(quantity);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName.isBlank()) {
            throw new IllegalArgumentException("Name customer must be not empty");
        }
        this.customerName = customerName;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Count must be more than 0");
        }
        this.quantity = quantity;
    }
}
