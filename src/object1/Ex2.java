package object1;
class MyTv3 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prev;
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.prev = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void gotoPrevChannel() {
		this.setChannel(this.prev);
	}
	
}
public class Ex2 {
	public static void main(String[] args) {
		MyTv3 t= new MyTv3();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println(t.getChannel());
	}

}
