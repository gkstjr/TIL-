package september;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.prefs.BackingStoreException;

class Day11_2331 {
	static int new_num = 0;
	public static void main(String args[]) throws Exception {
     
		List<Integer> arr = new  ArrayList<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		arr.add(A);
		int n = 0;
		while(true) {
			n = square(A, P);
			if(arr.contains(n)) {
				break;
			}else {
				arr.add(n);
			}
			
			A = n;
		}
		
		System.out.println(arr.indexOf(n));
		
		for(int i : arr) {
			System.out.println(i);
		}
	
	}
	
	static int square(int num , int squ) {
		new_num = 0;
		
		while(num!= 0) {
			new_num += Math.pow(num % 10, (double)squ);
			num /= 10;
		}
		
		return new_num;
	}
}


