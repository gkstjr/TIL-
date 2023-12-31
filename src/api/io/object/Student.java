package api.io.object;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	private int score;
	private transient String address;
	public Student(String name, int score, String address) {
		super();
		this.name = name;
		this.score = score;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", address=" + address + "]";
	}
	
	
	
}
