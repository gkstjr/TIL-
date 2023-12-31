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
 
public class Main62 { //알고리즘 복기중
	public static boolean[] prime;	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int start = n ;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 2 * n - 1; i++) {
				if(j == start) sb.append("*");
			}
			start--;
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}