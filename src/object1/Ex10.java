package object1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex10 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e	) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
			
		});
		
	}
}
