package algorithm;

import java.util.Arrays;

public class InsertionSort {
	static int[] arr = new int[40];
	public static void main(String[] args) {
		insertData();
		int tmp , prev;
		for(int index = 1; index < arr.length; index++) { // 2번쨰의 원소부터 비교 시작(해당 원소의 이전 값들과 비교하여 조건에 맞춰 뒤로 옮기고 지정된 자리에 해당 원소 삽입)
			tmp = arr[index];
			prev = index - 1;
			
			while(prev >= 0 && tmp < arr[prev]) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			
			arr[prev + 1] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
		//printArray();
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
