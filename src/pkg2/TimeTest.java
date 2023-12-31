package pkg2;
class Time {
	int hour;
	int minute;
	int second;

	public void setHour(int hour) {
		if(hour < 0 || hour >23) return;
		this.hour = hour;
	}
	public int getHour() { return hour;};
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		
	}
}
 


