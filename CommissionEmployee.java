package enhancedEmployeeHeirarchy;

public class CommissionEmployee extends Employee {
	private double grossSales;

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	private double commissionRate;

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public CommissionEmployee(String firstName, String lastName, String socSecNum, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socSecNum);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double earnings() {
		return grossSales * commissionRate;
	}

	@Override
	public void raise(double percent) {
		percent /= 100.00;
		setCommissionRate(getCommissionRate() * (1 + percent));
	}

	@Override
	public String toString() {
		return String.format("Commisioned %s Gross Sales: %.2f%n Commision Rate: %.4f%n Earnings: $%.2f%n",
				super.toString(), getGrossSales(), getCommissionRate(), earnings());
	}
}
