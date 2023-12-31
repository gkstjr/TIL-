package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.prefs.BackingStoreException;
/*

 *  'A' = 65
 * */
class Main {
    public static void main(String args[]) throws Exception {
     
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st;
    	// 진법 정보
    	st = new StringTokenizer(br.readLine());
    	
    	int A = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	
    	//A진법으로 나타낸 수의 자리수
    	int m = Integer.parseInt(br.readLine());
    	
    	//A진법으로 자릿수
    	
    	st = new StringTokenizer(br.readLine());
    	long[] arr = new long[m];
    	
    	int square = 1;
    	long sum = 0;
    	for(int i = 0 ; i < m; i++) {
    		arr[i] = Long.parseLong(st.nextToken());  		
    	}
    	for(int i = arr.length - 1; i >= 0; i--) {
    		sum += arr[i] * square;
    		square *= A;
    	}
    	
    	Stack<Long> stk = new Stack<Long>();
    	
    	while(sum != 0) {
    		stk.push(sum % B);
    		
    		sum /= B;
    	}
    
    	
    	while(!stk.isEmpty()) {
    		if(stk.size() == 1) {
    			System.out.print(stk.peek());
    		}else {
    			System.out.print(stk.peek() + " ");
    		}
    		
    		stk.pop();
    	}
    }
}
