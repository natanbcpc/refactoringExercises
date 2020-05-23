package exercise2;

public class JobItem {

	private int quantity;
	private int unitPrice;

	public JobItem(int quantity, int unitPrice) {
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public JobItem(int quantity, Employee employee) {
		this(quantity, employee.getRate());
	}

	public int getTotalPrice() {
		return quantity * unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

}
