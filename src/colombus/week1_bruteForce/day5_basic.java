package colombus.week1_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class day5_basic {	
	public static int n, k;
	public static int[] card;
	public static boolean[] visited;
	public static HashSet<String> hashset = new HashSet<>();
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	n = Integer.parseInt(st.nextToken()); 
    	st = new StringTokenizer(br.readLine());
    	k = Integer.parseInt(st.nextToken());
    
    	card = new int[n];
    	visited = new boolean[n];
    	
    	for(int i=0;i<n;i++) {
    		st = new StringTokenizer(br.readLine());
    		card[i] = Integer.parseInt(st.nextToken()); 
    	}
    	
    	simulate(new String(), 0);
    	System.out.println(hashset.size());
	}
    
    public static void simulate(String s, int level){
    	if(level == k) {
//    		System.out.println(s);
    		hashset.add(s);
    		return ;
    	}
    	for(int i=0;i<n;i++) {
    		if(visited[i] == true) continue;
    		visited[i] = true;
    		simulate( s + String.valueOf(card[i]), level + 1);
    		visited[i] = false;
    	}	
    }
}