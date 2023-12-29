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
 
public class Main64 {
		static int[] arr;
		static int cnt = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N + 1];
		
		for(int i = 1 ; i < N + 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		

	}	
}