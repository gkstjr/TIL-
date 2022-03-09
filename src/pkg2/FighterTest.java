package pkg2;
abstract class Monster {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}
interface Fightable{
	void move(int x, int y) ; //public abstract가 생략됨
	void attack(Fightable f);	//public abstract가 생략됨
}
 
class Fighter extends Monster implements Fightable{
	public void move(int x, int y) {
		System.out.println(x+"만큼이동"+y+"만큼이동");
	}; 
	public void attack(Fightable f) {
		System.out.println(f + "를 공격해라");
	}; 	

	Fightable getFightable() {
		Fighter f =new Fighter();
		return f;
	}
}


public class FighterTest {

	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		Monster f =new Fighter();
		Fighter f =new Fighter();
//		f.move(100, 200);
//		f.attack(f);
		Fightable f2 = f.getFightable();
	
	
	}

}
