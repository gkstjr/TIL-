package backjun;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main60 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	int n = Integer.parseInt(br.readLine());
	
	for(int i = 0; i < n; i++) {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(lcm(a,b));
	}
	
	}
	
	// 최대공약수 반복문 방식
	static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a % b);
	}
	
	static int lcm(int a, int b) {
		return a * b / gcd(a,b);
	}
	
}