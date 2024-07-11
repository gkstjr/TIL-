package programmers;

import java.util.*;

class Solution { //코딩테스트 합격자 되기 자바 패키지 따로 파서 정리

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        for(int i = score.length - m; i >= 0; i-= m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
} 