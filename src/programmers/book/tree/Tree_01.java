package programmers.book.tree;
import java.util.*;

public class Tree_01 {
    private static int answer = 0;
    public int solution(int n, int a, int b)
    {
        recur(a , b);        

        return answer;
    }
    
    private static void recur(int a, int b) {
        if(a == b) return;
        answer += 1;

        recur((a + 1) / 2 , (b + 1) / 2);
        
    }
}
