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
class Day28_1850 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       StringTokenizer st = new StringTokenizer(br.readLine());
       StringBuilder sb = new StringBuilder();
       long a = Long.parseLong(st.nextToken());
       long b = Long.parseLong(st.nextToken());
       
       long num = (gcd(Math.max(a, b),Math.min(a, b)));
       
       
       for(int i = 0 ; i < num; i++) {
    	   sb.append("1");
       }
       System.out.println(sb);
     }
    
    static long gcd(long a , long b) {
    	if(b == 0) return a;
    	
    	return gcd(b,a % b);
    }
    
}
