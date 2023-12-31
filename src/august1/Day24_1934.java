package august1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * */
class Day24_1934 {
    public static void main(String args[]) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		
    		System.out.println(A * B / gcd(A , B));
    	}
    	
    }
    
    static int gcd(int a , int b) {
    	if(b == 0) return a;
    	
    	return gcd(b, a % b);
    }
}
