package programmers;

import java.util.*;

class Solution_추억점수 {
    public ArrayList<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int sum;
        for(int i = 0; i < photo.length; i++) {
            String[] photos = photo[i];
            sum = 0;
            for(int j = 0; j < photos.length; j++) {
                String temp = photo[i][j];
                for(int k = 0 ; k < name.length; k++) {
                    if(temp.equals(name[k])) {
                        sum += yearning[k];    
                    }
                }
            }
            answer.add(sum);
        }
        return answer;
    }
}