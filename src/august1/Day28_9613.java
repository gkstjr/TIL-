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

 *  
 * */
class Day28_9613 {
    public static void main(String args[]) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       StringBuilder sb = new StringBuilder();
       int T = Integer.parseInt(br.readLine());
       
       int[] arr;
       long sum;
       for(int i = 0; i < T; i++) {
    	   st = new StringTokenizer(br.readLine());
    	   
    	   int n = Integer.parseInt(st.nextToken());
    	   arr = new int[n];
    	   sum = 0;
    	   for(int j = 0 ; j < n; j++) {
    		   arr[j] = Integer.parseInt(st.nextToken());
    	   }
       
    	   for(int k = 0; k < arr.length; k++) {
    		   for(int l = k + 1 ; l < arr.length; l++) {
    			  sum += gcd(Math.max(arr[k], arr[l]), Math.min(arr[k], arr[l]));
    		   }
    	   }
    	   sb.append(sum).append("\n");
       }
    System.out.println(sb);
    
    }
    
    static int gcd(int a, int b) {
    	if(b == 0) return a;
    	
    	return gcd(b, a % b);
    }
    
}
