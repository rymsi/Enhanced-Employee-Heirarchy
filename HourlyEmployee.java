package enhancedEmployeeHeirarchy;

public class HourlyEmployee extends Employee{
	
	private double hourlyWage;
	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, String socSecNum, double hourlyWage, double hoursWorked) {
		super(firstName, lastName, socSecNum);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	private void setHourlyWage(double newHourlyWage) {
		if(newHourlyWage > 0.00) {
			hourlyWage = newHourlyWage;
		}
		else {
			throw new IllegalArgumentException("Please enter a positive value for Hourly Wage.");
		}
	}
	private double getHourlyWage() {return hourlyWage;}
	
	private void setHoursWorked(double newHoursWorked) {
		if((newHoursWorked <= 168.00)&&(newHoursWorked >= 1)) {
			hoursWorked = newHoursWorked;
		}
		else {
			throw new IllegalArgumentException("Please enter a number between 1 and 168, inclusive.");
		}
	}
	private double getHoursWorked() {return hoursWorked;}
	
	public double earnings() {
		if(hoursWorked <= 40) {
			return (hoursWorked * hourlyWage);
		}
		else {
			return ((40*hourlyWage)+(((hoursWorked-40)*1.50)*(hourlyWage)));
		}
	}
	@Override
	public void raise(double percent) {
		percent /= 100;
		setHourlyWage(getHourlyWage()*(1+percent));
	}
	@Override
	public String toString() {return String.format("Hourly %s Hourly Wage: %.2f%n Hours Worked: %.2f%n Earnings: $%.2f%n", 
			super.toString(), getHourlyWage(), getHoursWorked(), earnings());}
}
