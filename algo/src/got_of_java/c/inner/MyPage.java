package got_of_java.c.inner;

public class MyPage {
	public InputBox input;
	
	public static void main(String[] args) {
		MyPage myPage = new MyPage();
		myPage.setUI();
		myPage.pressKey();
	}
	
	public void setUI() {
		input = new InputBox();
		
		input.setKeyListener(new KeyEventListener() {
			
			public void onKeyDown() {
				System.out.println("Key Down");
			};
			
			public void onKeyUp() {
				System.out.println("Key Up");
			}
		});
	}
	
	public void pressKey() {
		input.listenerCalled(input.KEY_UP);
		input.listenerCalled(input.KEY_DOWN);
	}
	
}
