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
class Day31_2089 {
    public static void main(String args[]) throws Exception {
     

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	if(n  == 0) System.out.println(0);
    	else {
    		
    		while(n != 1 ) {

    			sb.append(Math.abs(n % -2));
    			n = (int)Math.ceil((double)n / -2);
    		}
    		sb.append(n);
    		System.out.println(sb.reverse());
    	}
    	
    }
}
