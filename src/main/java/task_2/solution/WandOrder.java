package task_2.solution;

public class WandOrder {
    private String customerName;
    private Wand wand;
    private int quantity;
    public WandOrder(String customerName, Wand wand, int quantity) {
        if (customerName == null || customerName.isEmpty()) {
            throw new IllegalArgumentException("Имя клиента не может быть пустым");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Количество должно быть больше 0");
        }

        this.customerName = customerName;
        this.wand = wand;
        this.quantity = quantity;
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
