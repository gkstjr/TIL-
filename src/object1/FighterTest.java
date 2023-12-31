package object1;

abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}
	interface Fightable{
		void move(int x, int y);
		void attact(Fightable f);
	}

	class Fighter extends Unit2 implements Fightable {
		public void move(int x, int y) {
			System.out.println(x+"," +y +"로 이동");
			
		}
		
		public void attact(Fightable f) {
			System.out.println(f +"를 공격");
			
		}
	}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 100);
		f.attact(new Fighter());
		
	}
	
	}

