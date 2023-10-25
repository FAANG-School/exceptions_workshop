package task_2;

public class WandOrder {
    private String customerName;
    private Wand wand;
    private int quantity;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName.isBlank()) {
            throw new IllegalArgumentException("Имя покупателя не должно быть пустым");
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
        if (quantity<=0) {
            throw new IllegalArgumentException("Колчиество должно быть не равно или меньше нуля");
        }
        this.quantity = quantity;
    }
}
