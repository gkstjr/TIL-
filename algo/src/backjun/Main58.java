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
 
public class Main58 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	int c = Integer.parseInt(st.nextToken());
	
	int answer1 = (a+b) % c;
	int answer2 = ((a % c) + (b % c)) % c;
	int answer3 = (a * b) % c;
	int answer4 = ((a % c) * (b % c)) % c;
	
	System.out.println(answer1);
	System.out.println(answer2);
	System.out.println(answer3);
	System.out.println(answer4);

	}
}