package programmers;

import java.util.HashMap;
import java.util.*;
class Solution_기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0 ; //약수의 개수
        
        for(int i = 1 ; i <= number; i++) { //i의 약수의 개수 구하기
            cnt = 0; 
            for(int j = 1 ; j <= Math.sqrt(i); j++) { 
                if(i % j == 0) {
                    cnt++;
                    if(i / j != j) cnt++;
                  //  System.out.println(j);
                }
             }
           // System.out.println("cnt =" + cnt);
            if(cnt > limit) cnt = power;
            answer += cnt;
        }
       
        return answer;
    }
}