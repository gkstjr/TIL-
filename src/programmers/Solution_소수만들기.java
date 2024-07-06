package programmers;

import java.util.*;

class Solution_소수만들기 { //1.이력서 . 포트폴리오 update 2. CS전공 핵심요약집 3. 코딩 테스트(프래그래머스)  4. FeedB 프로젝트 이해
	    public int solution(int[] nums) {
	        int answer = 0;
	        
	        for(int i = 0; i < nums.length; i++) {
	            for(int j = i + 1 ; j < nums.length; j++) {
	                for(int k = j + 1 ; k < nums.length; k++) {
	                    if(isPrime(nums[i] + nums[j] + nums[k])) answer++;
	                }
	            }
	        }

	        return answer;
	    }
	    
	    public Boolean isPrime(int num) {
	        int cnt = 0;
	        for(int i = 1; i <= Math.sqrt(num); i++) {
	            if(num % i == 0) cnt++;
	        }
	        
	        return cnt == 1;
	    }
	
} 