package programmers.book.sort;
import java.util.*;

public class Sort_02 {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        
        Arrays.sort(str , (o1 , o2) -> o2.compareTo(o1));
        String ans = "";
        for(String s : str) {
            ans += s;
        }
        return Long.valueOf(ans);
    }
}
