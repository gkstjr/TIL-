package got_of_java.c.middle;

public class Employee {
	
	private String name;
	private int type;
	private long salary;
	
	public Employee(String name, int type, long salary) {
		this.name = name;
		this.type = type;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getType() {
		return this.type;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public long getSalary() {
		return this.salary;
	}
	
	
}
