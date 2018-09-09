package enhancedEmployeeHeirarchy;

public abstract class Employee {
	
	public static void main(String[] args) {
		
		CommissionEmployee employee1 = new CommissionEmployee("Fred", "Jones", "111-11-1111", 2000.0, .05);
		BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Sue", "Smith", "222-22-2222", 3000.0, .05, 300);
		SalariedEmployee employee3 = new SalariedEmployee("Sha", "Yang", "333-33-3333", 1150.0);
		HourlyEmployee employee4 = new HourlyEmployee("Ian", "Tanning", "444-44-4444", 15.0, 50);
		HourlyEmployee employee5 = new HourlyEmployee("Angela", "Domchek", "555-55-5555", 20.0, 40);
		
		System.out.printf("%s%s%s%s%s", employee1, employee2, employee3, employee4, employee5);
		
		Employee[] employees = new Employee[5];
		
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		employees[4] = employee5;
				
		for(Employee elem: employees) {
			if(String.valueOf(elem.getClass().getName())=="enhancedEmployeeHeirarchy.SalariedEmployee") elem.raise(4.00);
			else elem.raise(2.00);
		}
		System.out.printf("%nEmployee information after raises.%n");

		System.out.printf("%s%s%s%s%s", employee1, employee2, employee3, employee4, employee5);

	}
	private final String firstName;
	private final String lastName;
	private final String socSecNum;

	public Employee(String firstName, String lastName, String socSecNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecNum = socSecNum;
	}		
	public abstract double earnings();
	
	public abstract void raise(double percent);
	
	@Override
	public String toString() {
		return String.format("Employee: %s %s with ssn: %s%n", firstName, lastName, socSecNum);
	}
}
