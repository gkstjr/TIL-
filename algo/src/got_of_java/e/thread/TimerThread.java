package got_of_java.e.thread;

import java.util.Date;

public class TimerThread extends Thread {
	
	public void run() {
		for(int i = 0 ; i < 10; i++) {
			printCurrentTime();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void printCurrentTime() {
		
		Date date = new Date();
		
		System.out.println(date + " " + System.currentTimeMillis());
	}
}
