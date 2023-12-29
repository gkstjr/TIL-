package pkg2;

public class Test03 {
	public static void main(String[] args) {
		
		Unit[] group = { new Marine(), new Tank(), new DropShip()};
		
		for(int i=0 ; i<group.length; i++ ) {
			group[i].move(100,200);
		}
	}
}
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine" + x +"," + y);
	}
	void stimPack() {
		
	}
}
class Tank extends Unit {
	void move(int x , int y) {
		System.out.println("Tank" + x + "," + y);
		}
	void changeMode() {}
}

class DropShip extends Unit {
	void move(int x , int y) {
		System.out.println("DropShip" + x + "," + y);
	}
	void load() {//태운다  
		}
	void unload() {
		//내린다.
}
		
}
