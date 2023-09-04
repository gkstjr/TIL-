package september;

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
class Day04_1978 {
    public static void main(String args[]) throws Exception {
     
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int answer = 0; 
    	for(int i = 0 ; i < N; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		int cnt = 0;
    		
    		for(int j = 1; j <= num; j++) {
    			if(num % j == 0) {
    				cnt++;
    			}
    		}
    		
    		if(cnt == 2) {
    			answer++;
    		}
    		
    	}
    	
    	System.out.println(answer);
    }
}
