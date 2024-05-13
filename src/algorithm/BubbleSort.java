package algorithm;

public class BubbleSort {
	static int[] arr = new int[40];
	public static void main(String[] args) {
		insertData();
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	
	static void insertData() {
		 
		for(int i = 0; i  < arr.length; i++) {
			int random = (int)(Math.random() * (arr.length + 1)); //0 ~ 40 사이
			arr[i] = random;
		}
	
	}
}
