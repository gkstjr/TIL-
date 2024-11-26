package programmers.book.dynamicProgram;
import java.util.*;

public class dp_basic01 {
	public static void main(String[] args) {
		String str1 = "AGGTAB";
		String str2 = "GXTXAYB";
		
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
	
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[0].length; j++) {
				if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		int answer = 0;
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0 ; j < dp[0].length; j++) {
				answer = Math.max(answer, dp[i][j]);
			}
		}
		
		System.out.println(answer);
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
