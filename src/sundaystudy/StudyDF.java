package sundaystudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class StudyDF { // ù DP �����ε� �̷��� ���������µ� ����Ǯ���� �ϴ� ���׸� �κп��������� ��Ģ�� ã�Ƴ��� ���ϰ���..
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 4 ; i < 11; i++) { // �������� ������ 11���� �۴ٰ� ������ 11���� ���� ������ ���� �� ������
			
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}
		
		for(int i = 0 ; i < n; i++ ) {
			int num = Integer.parseInt(br.readLine());
			
			sb.append(dp[num]).append("\n");
		}
		
		System.out.println(sb);
	}
	
}