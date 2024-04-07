package got_of_java.e.thread;

public class TimerMain {
	public static void main(String[] args) {
		TimerThread thread = new TimerThread();
		thread.start();
	}
}
