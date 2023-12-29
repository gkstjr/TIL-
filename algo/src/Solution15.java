class Solution15 {
    public int solution(int num, int n) {
        int answer = 0;
        
        if(num % n == 0) answer = 1; // 배수일 때
       
        else answer = 0;
        
        return answer;
    }
}