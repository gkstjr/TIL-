class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        //왼쪽 출발
        for(int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            for(int j = 0; j < cnt; j++) {
                sb.append(String.valueOf(i));
            }
        }
                
        answer = sb.toString() + "0" + sb.reverse().toString();
        
        return answer;
    }
}