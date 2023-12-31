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
class Day30_1373 {
    public static void main(String args[]) throws Exception {
     
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	String str = br.readLine();
    	
    	//길이가 3으로 나누고 1자리만 남을 때
    	if(str.length() % 3 == 1) 
    		sb.append(str.charAt(0));
    	if(str.length() % 3 == 2) 
    		sb.append(((str.charAt(0) - '0') * 2) + (str.charAt(1) - '0'));
    	
    	for(int i = str.length() % 3; i < str.length(); i+=3) {
    		sb.append((str.charAt(i) - '0') * 4 + (str.charAt(i + 1) - '0') * 2 + (str.charAt(i+2) - '0'));
    	}
    	
    	System.out.println(sb);
    }
}
