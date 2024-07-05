package programmers;

import java.util.*;

class Solution { //1.이력서 . 포트폴리오 update 2. CS전공 핵심요약집 3. 코딩 테스트(프래그래머스)  4. FeedB 프로젝트 이해
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        for(int i = score.length - m; i >= 0; i-= m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
} 