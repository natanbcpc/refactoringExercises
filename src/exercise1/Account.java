package exercise1;

public class Account {

	// ...
	private AccountType type;
	private int daysOverdrawn;
	  
	public double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += type.overdraftCharge(daysOverdrawn);
	    }
	   return result;
	}

}