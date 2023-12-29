package thread;

import javax.swing.JOptionPane;


public class Test02 {
	public static void main(String[] args) throws InterruptedException {
//		Thread(쓰레드)의 이해
//		=한 번에 하나의 작업을 수행할 수 있는 프로그래밍 처리 단위(ex : 일꾼)
		
		Thread t = new Thread() {
			
			public void run() {
				for(int i=1 ; i<=100; i++) {
					System.out.println("i = " + i);
					try {
						Thread.sleep(1000l);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		
		};
		t.setName("sub");
		t.setDaemon(true);
		t.start();
		
		JOptionPane.showMessageDialog(null, "테스트용 메세지");
		
		
	}
}
