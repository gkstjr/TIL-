

class Solution39 {	
		 public static void main(String[] args) {
	    	Solution39 sol = new Solution39();
//	    	int[] num = {0,1,2,4,3};
//	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
//	    	System.out.println(num[1]);
	    	System.out.println(sol.solution("78720646226947352489"));
	    } 
	public int solution(String number) {
        int answer = 0;
        String[] str = number.split("");
        int sum = 0;
        for(int i = 0 ; i <number.length(); i++) {
        	sum += Integer.parseInt(str[i]);
        }
        return sum % 9;
    }
}
