package got_of_java;

public class SmartPhone {
	boolean power;
	int battery;
	int number;
	
	public SmartPhone() {
		
	}
	
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜집니다.");
	}
	
	public void powerOff() {
		power = false;
		System.out.println("전원이 꺼집니다.");
	}
	
	public int checkBattery() {
		return battery;
	}
	
	
}