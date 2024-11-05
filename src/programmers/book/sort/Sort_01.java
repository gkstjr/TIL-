package programmers.book.sort;
import java.util.*;

public class Sort_01 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings , (o1 , o2) -> {
            if(o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
            return o1.charAt(n) - o2.charAt(n);
            }
                );
        
        return strings;
    }
}
