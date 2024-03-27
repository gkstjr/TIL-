class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        //왼쪽 출발
        for(int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            for(int j = 0; j < cnt; j++) {
                answer += String.valueOf(i);
            }
        }
        
        answer += "0";
        
        //오른쪽 출발
        for(int i = food.length - 1; i > 0; i--) {
            int cnt = food[i] / 2;
            for(int j = 0; j <cnt; j++) {
                answer += String.valueOf(i);
            }
        }
       // System.out.println(answer);
        return answer;
    }
}