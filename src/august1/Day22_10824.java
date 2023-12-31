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
class Day22_10824 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        String D = st.nextToken();
        
        System.out.println(Long.parseLong(A + B) + Long.parseLong(C + D));
    }
}
