package programmers;

import java.util.*;
<<<<<<< HEAD
class Solution {
    public List<Integer> solution(int[] answers) {
    	
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int cnt1 = 0; int cnt2 = 0; int cnt3 = 0;
        for(int i = 0 ; i < answers.length; i++) {
          cnt1 += one(i , answers[i]);
          cnt2 += two(i , answers[i]);
          cnt3 += three(i , answers[i]);

=======
class Solution { //프로그래머스 재seting
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        for(int i = score.length - m; i >= 0; i-= m) {
            answer += score[i] * m;
>>>>>>> branch 'master' of https://github.com/gkstjr/TIL-.git
        }
        
        return answer;
    }
}