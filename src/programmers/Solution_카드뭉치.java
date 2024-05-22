package programmers;

import java.util.Scanner;

import java.util.*;
class Solution_카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int index1 = 0;
        int index2 = 0;
        
        for(int i = 0 ; i < goal.length; i++) {
            String tmp = goal[i];
            if(index1 < cards1.length && cards1[index1].equals(tmp)) index1++;
            else if(index2 < cards2.length && cards2[index2].equals(tmp)) index2++;
            else return "No";
        }
        
        return "Yes";
    }
}