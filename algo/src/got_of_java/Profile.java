package got_of_java;

public class Profile {
	String name;
	int age;
	
	public static void main(String[] args) {
		Profile profile = new Profile();
		profile.setName("Min");
		profile.setAge(20);
		profile.printName();
		profile.printAge();
	}
	
	
	public void setName(String str) {
		this.name = str;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public void printAge() {
		System.out.println(age);
	}
	
	
}