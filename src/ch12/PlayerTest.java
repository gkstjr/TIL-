package ch12;
abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"부터 시작");}
	void stop() {System.out.println("멈춤");}
}


public class PlayerTest {
	public static void main(String[] args) {
//			Player p = new 
			Player ap = new AudioPlayer();
			ap.play(100);
			ap.stop();
	}
}
