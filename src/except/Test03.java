package except;
class Person {
	long id;
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id;
		else return false;
	}

	Person(long id) {
		this.id = id;
	}
}

public class Test03 {
	public static void main(String[] args) {
		Person p1 = new Person(9609031451118l);
		Person p2 = new Person(960903145111l);
		
		if(p1.equals(p2)) 
			System.out.println("p1과 p2는 같은 사람입니다.");
		else System.out.println("p1과 p2는 다른사람입니다.");
		}
	}

