class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(Character.isLowerCase(ch)) { //소문자
                if((ch - 0) + n > 122) { //z를 넘을 때
                   answer += (char)(((ch - 0) + n - 122) + 96);
                }else {
                    answer += (char)(ch - 0 + n);
                } 
            }else if(Character.isUpperCase(ch)) { //대문자일 때
                 if((ch - 0) + n > 90) { //Z를 넘을 때
                   answer += (char)(((ch - 0) + n - 90) + 64);
                }else {
                    answer += (char)(ch - 0 + n);
                } 
            }else {//공백
                answer += " ";
            }
        }
        return answer;
    }
}