package han.beans;

public class ScoreDto {
	private String name;
	private int korean,english,math;
	public ScoreDto() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return korean + english + math;
	}
	public float getAverage() {
		return getTotal()/3f;
	}
	@Override
	public String toString() {
		return "ScoreDto [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + "]";
	}
	
	
}
