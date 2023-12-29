package except;
class Person2{
	long id;

	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 b = (Person2)obj;
			return this.id==b.id;
		}else {
			return false;
		}
	}
	Person2(long id){
		this.id = id;
	}

}

public class Ex8 {
	public static void main(String[] args) {
			Person2 p1 = new Person2(8011081111222l);
			Person2 p2 = new Person2(8011081111222l);
			
			if(p1.equals(p2))
				System.out.println("같습니다");
			else System.out.println("다릅니다");
	}
	
}
