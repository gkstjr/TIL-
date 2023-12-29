package study.instance1;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	 
	void turnOnOff() {
		if(isPowerOn==true)	{
			this.isPowerOn =false;
		}else {
			this.isPowerOn=true;
		}
	}
	void volumeUp() {
		if(volume<MAX_VOLUME) {
			this.volume++;
		}
	}
	void volumeDown() {
		if(volume>MIN_VOLUME) {
			this.volume--;
			} 
	}
	void channelUp() {
		if(channel==MAX_CHANNEL) {
			this.channel=MIN_CHANNEL;
		}else {
			
			this.channel++;
	}
	}
	void channelDown() {
		if(channel==MIN_CHANNEL) {
			channel=MAX_CHANNEL;
		}
		this.channel--;
	}

	public static void main(String[] args) {
		MyTv t =new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH: " + t.channel + ", VOL: " +t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println(t.channel+","+t.volume);
		
		t.volume=100;
		t.channelUp();
		t.volumeUp();
		System.out.println(t.channel + "," + t.volume);
	
	}
}
