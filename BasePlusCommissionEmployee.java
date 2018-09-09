package enhancedEmployeeHeirarchy;

public class BasePlusCommissionEmployee extends Employee {
	
	private double baseSalary;
	private double grossSales;
	private double commissionRate;
	
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		if(baseSalary > 0) {this.baseSalary = baseSalary;} else {
			throw new IllegalArgumentException("Base Salary should be greater than zero.");}
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socSecNum, double grossSales, double commissionRate, double base) {
		super(firstName, lastName, socSecNum);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = base;
	}
	public double earnings() {
		return baseSalary+(grossSales*commissionRate);
	}
	@Override
	public void raise(double percent) {
		percent /= 100.00;
		setCommissionRate(getCommissionRate()*(1+percent));
		setBaseSalary(getBaseSalary()*(1+percent));
	}
	@Override
	public String toString() {return String.format("Base Salary Plus Commissioned %s Gross Sales: %.2f%n Commision Rate: %.4f%n with Base Salary of: $%.2f%n Earnings: $%.2f%n", 
			super.toString(), getGrossSales(), getCommissionRate(), getBaseSalary(), earnings());} 

}
