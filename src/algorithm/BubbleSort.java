package algorithm;
//거품 정렬(BubbleSort) 시간복잡도 = o(n^2)
public class BubbleSort {
	static int[] arr = new int[40];
	public static void main(String[] args) {
		insertData();
		int temp = 0;
		for(int i = 0 ; i < arr.length - 1; i++) {
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j] > arr[j - 1]) { //앞의 값이 더 크면 큰 값을 뒤로 가게 변경해주기
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		
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
