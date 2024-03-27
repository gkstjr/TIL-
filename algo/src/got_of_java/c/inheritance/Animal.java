package got_of_java.c.inheritance;

public class Animal {
	
	public String name;
	public String kind;
	public int legCount;
	public int iq;
	public boolean hasWing;
	
	public void move() {
		System.out.println(name + " 동물이 이동합니다.");
	}
	
	public void eatFood() {
		System.out.println(name + " 동물이 먹이를 먹습니다.");
	}

}
