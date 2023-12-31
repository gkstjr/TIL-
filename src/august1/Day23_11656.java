package august1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * */
class Day23_11656 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
     
        String[] arr = new String[str.length()];
        
        for(int i = 0 ; i < arr.length; i++) {
        	arr[i] = str.substring(i);
        }
        
        Arrays.sort(arr);
    
    StringBuilder sb = new StringBuilder();
    for(String s : arr) {
    	sb.append(s).append("\n");
    }
    System.out.println(sb);
    }

}
