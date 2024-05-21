package algorithm;
//선택 정렬
public class SelectionSort {
	static int[] arr = new int[40];
	public static void main(String[] args) {
		insertData();
		int indexMin , tmp;
		for(int i = 0; i < arr.length - 1; i++) {
			indexMin = i; 
			for(int j = i + 1; j < arr.length; j++ ) {
				if(arr[indexMin] > arr[j]) { //정해진 위치의 값보다 비교하는 값이작은 경우 해당 위치 저장
					indexMin = j;
				}	
			}
			
			tmp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = tmp;
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
