package task_2;

public class WandOrder {

	private String customerName;
	private Wand wand;
	private int quantity;

	public WandOrder(String customerName, Wand wand, int quantity) {
		if(customerName == null || customerName.isBlank() || wand == null || quantity <= 0) {
			throw new IllegalArgumentException("Please check order arguments");
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

	@Override
	public String toString() {
		return "From: " + customerName + " for " + quantity + "pc(s)";
	}
	
	

}
