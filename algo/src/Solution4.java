import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			sb.append(str);
		}
		System.out.println(sb);
	}
}