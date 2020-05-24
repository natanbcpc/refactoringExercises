package exercise5;

public class Item {

	private float price;
	private float tax;
	private float saleDiscount;
	private boolean isOnSale;

	public Item(float price, float tax, float saleDiscount, boolean isOnSale) {
		this.price = price;
		this.tax = tax;
		this.isOnSale = isOnSale;
		this.saleDiscount = saleDiscount;
	}

	public void setOnSale(boolean onSale, float saleDiscount) {
		this.isOnSale = onSale;
		this.saleDiscount = saleDiscount;
	}

	private float getPriceWithTax() {
		return price + tax;
	}

	private float getPriceOnSale() {
		float priceWithTax = getPriceWithTax();
		float discount = priceWithTax * saleDiscount;
		return priceWithTax - discount;
	}

	public float getCalculatedPrice() {
		if(isOnSale) {
			return getPriceOnSale();
		}
		return getPriceWithTax();
	}
}
