package programmers;

import java.util.HashMap;
import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
    	
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int cnt1 = 0; int cnt2 = 0; int cnt3 = 0;
        for(int i = 0 ; i < answers.length; i++) {
          cnt1 += one(i , answers[i]);
          cnt2 += two(i , answers[i]);
          cnt3 += three(i , answers[i]);

        }
          //  System.out.println(cnt1 +"," + cnt2 + "," + cnt3);
            if(Math.max(Math.max(cnt1, cnt2), cnt3) == cnt1) answer.add(1);
           if(Math.max(Math.max(cnt1, cnt2), cnt3) == cnt2) answer.add(2);
           if(Math.max(Math.max(cnt1, cnt2), cnt3) == cnt3) answer.add(3);
    
        Collections.sort(answer);
        return answer;
    }
    
    public static int one(int index , int answer) {
      //  System.out.println("oneTmp = " + (index % 5 + 1));
        if((index % 5 + 1) == answer) return 1; // 정답일 때
        return 0;
    }
    
    public static int two(int index , int answer) {
        if((index % 2 == 0) && answer == 2) return 1;
        int tmp = index % 8;
        //System.out.println("twoTmp = " + tmp);
        switch(tmp) {
                case 1:
                if(answer == 1) return 1;
                break;
                 case 3:
                if(answer == 3) return 1;
                break;
                 case 5:
                if(answer == 4) return 1;
                break;
                 case 7:
                if(answer == 5) return 1;
                break;
        }
        return 0;
    }
    
    public static int three(int index, int answer){
        int tmp = index % 10;
       // System.out.println("threeTmp = " + tmp);
        if((tmp == 0 || tmp == 1) && answer == 3) return 1; 
        else if((tmp == 2 || tmp == 3) && answer == 1) return 1;
        else if((tmp == 4 || tmp == 5) && answer == 2) return 1;
        else if((tmp == 6 || tmp == 7) && answer == 4) return 1;
        else if((tmp == 8 || tmp == 9) && answer == 5) return 1;
    
        return 0 ;
    }
}