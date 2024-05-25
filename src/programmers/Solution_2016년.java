package programmers;

import java.util.HashMap;
import java.util.*;
class Solution_2016년 {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {0, 31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
        String[] day = {"THU" , "FRI" , "SAT" , "SUN" , "MON" , "TUE" , "WED"};
        
        int d = 0;
        for(int i = 0 ; i < a; i++) {
            d += month[i]; // a월의 지난 일 + a월의 일 b         
        }
        answer = day[(d + b) % 7];
        return answer;
    }
}