package task_2;


public class WandOrder{
    String customerName;
    Wand wand;
    int quantity;

    public WandOrder(String customerName, Wand wand, int quantity) {
//        if (wand.woodType == "anus") { throw new NotEnoughWoodException("you're already dead");
        this.customerName = customerName;
        this.wand = wand;
        this.quantity = quantity;
    }
}
