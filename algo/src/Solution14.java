class Solution14 {
    public int solution(int a, int b) {
        int answer = 0;
        int sum = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int mul = 2 * a * b;
       
        
        return Math.max(sum, mul);
    }
}