package got_of_java.c.middle;

public class CalculateSalary {
	public static void main(String[] args) {
		CalculateSalary cal = new CalculateSalary();
		cal.calculateSalaies();
	}
	
	public void calculateSalaies() {
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("LeeDaeRi", 1, 1000000000);
		employees[1] = new Employee("KimManager", 2, 100000000);
		employees[2] = new Employee("WhangDesign", 3, 700000000);
		employees[3] = new Employee("ParkArchi", 4, 800000000);
		employees[4] = new Employee("LeeDevelop", 5, 600000000);

		for(Employee em : employees) {
			String name = em.getName();
			long salary = getSalaryIncrease(em);
			System.out.printf("%s=%d\n", name,salary);
		}
	}
	
	
	public long getSalaryIncrease(Employee employee) {
		
		long salary = employee.getSalary();
		switch(employee.getType()) {
		
			case 1:
				return salary + (long) (salary * -0.95);
			case 2:
				return salary + (long) (salary * 0.1);
			case 3:
				return salary + (long) (salary * 0.2);
			case 4:
				return salary + (long) (salary * 0.3);
			case 5:
				return salary + (long) (salary * 1);
				
			default: return 0;
		}
			
	}
}