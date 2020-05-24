package exercise1;

public class AccountType {

	public double overdraftCharge(double daysOverdrawn) {
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
		}
		
		return daysOverdrawn * 1.75;
	}

	public boolean isPremium() {
		// TODO Auto-generated method stub
		return false;
	}

}
