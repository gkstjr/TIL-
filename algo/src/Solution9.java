class Solution9 {
	
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < overwrite_string.length(); i++) {
        	ch[i+s] = overwrite_string.charAt(i);
        }
        for(char temp : ch) {
        	answer += temp;
        }
        return answer;
    }
}