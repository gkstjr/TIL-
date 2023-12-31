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
class Day28_11005 {
    public static void main(String args[]) throws Exception {
     
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	long N = Long.parseLong(st.nextToken());
    	long B = Long.parseLong(st.nextToken());
    	long remain = 0;
    	while(N != 0 ) {
    		
    		remain = N % B;
    		if(remain >= 10) {    			
    			sb.append((char)(remain + 55));
    		}else {
    			sb.append(remain);
    		}
    		N = N / B;
    	}
    	
    	System.out.println(sb.reverse());
    }
}
