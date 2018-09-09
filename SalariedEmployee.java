package enhancedEmployeeHeirarchy;

public class SalariedEmployee extends Employee{
	private double salary;
	public SalariedEmployee(String firstName, String lastName, String socSecNum, double salary) {
		super(firstName, lastName, socSecNum);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	private void setSalary(double newSalary) {
		if(newSalary > 0.00) {
			salary = newSalary;
		}
		else {
			throw new IllegalArgumentException("Please enter a positive value for Salary.");
		}
	}
	private double getSalary() {
		return salary;
	}
	public double earnings() {
		return salary;
	}
	@Override
	public void raise(double percent) {
		percent /= 100;
		setSalary(getSalary()*(1+percent));
	}
	@Override
	public String toString() {return String.format("Salaried %s Salary: %.2f%n Earnings: $%.2f%n", super.toString(), getSalary(), earnings());}
}