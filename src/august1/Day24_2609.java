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
class Day24_2609 {
    public static void main(String args[]) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	
    	int answer = gcd(a, b);
    	System.out.println(answer);
    	System.out.println(a * b / answer);
    } 
    //최대광약수
    static int gcd(int a , int b) {
    	if(b == 0) return a;
    	
    	return gcd(b , a % b);
    }
    
    static int lcm(int a, int b) {
    	
    	return a * b / gcd(a , b);
    }
}
