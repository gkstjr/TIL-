package algorithm;

public class Main {
	static int[] arr = new int[40];
	public static void main(String[] args) {
		insertData();
		
		
		
		printArray();
	}
	
	
	
	static void insertData() {
		 
		for(int i = 0; i  < arr.length; i++) {
			int random = (int)(Math.random() * (arr.length + 1)); //0 ~ 40 사이
			arr[i] = random;
		}
	
	}

	static void printArray() {
		System.out.print("[ ");
		for(int i : arr) {
			System.out.print(i + " , ");
		}
		
		System.out.print("]");

	}
	
}
