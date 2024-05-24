package programmers;

import java.util.HashMap;
import java.util.*;
class Solution_폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet();
        
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int length = nums.length / 2;
        //System.out.println(set.size() +" , " + length);
        if(length > set.size()) answer = set.size();
        else answer = length;
        return answer;
    }
}