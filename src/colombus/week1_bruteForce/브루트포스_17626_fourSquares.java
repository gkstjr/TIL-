package colombus.week1_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 :dp알고리즘 ->dp[i] = dp[i - j * j] + 1 (j는 i의 제곱근까지의 자연수들)
//예상 시간복잡도 : 
//오답노트 -> 처음에는 브루트포스로 반복하여 다 구해보려 했지만 예외의 경우인 ex) 12 =3의제곱 + 1 + 1 + 1 인 4개 보다 2의제곱 +2의제곱 + 2의제곱 = 3개가 더 좋다는 부분을 구하지 못하겠어서 DP 알고리즘으로 변경
public class 브루트포스_17626_fourSquares {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(br.readLine());
		int[] dp = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int j = 1; j <= Math.sqrt(i); j++) {
				dp[i] = Math.min(dp[i], dp[(int) (i - Math.pow(j, 2))] + 1);
				
			}
		}
		System.out.println(dp[n]);
	}
	
//   public static void main(String[] args) throws Exception{
//	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	   
//	   int n = Integer.valueOf(br.readLine());
//	   
//	   int cnt = 0;
//	   Loop1 :
//	   for(int i = (int) Math.sqrt(n) ; i > 0; i--) {
//		   int sum1 = 0;
//		   sum1 += Math.pow(i, 2);
//		   if(sum1 == n) {
//			   cnt = 1;
//			   break;
//		   }else if(sum1 > n) continue Loop1;
//		   Loop2 :
//		   for(int j = (int) Math.sqrt(n); j > 0; j--) {
//			   int sum2 = sum1;
//			   sum2 += Math.pow(j, 2);
//			   if(sum2 == n) {
//				   cnt = 2;
//				   break Loop1;
//			   }else if(sum2 > n) continue Loop2;
//		   
//			   Loop3 :
//				   for(int k = (int) Math.sqrt(n); k > 0; k--) {
//					   int sum3 = sum2;
//					   sum3 += Math.pow(k, 2);
//
//					   if(sum3 == n) {
//						   cnt = 3;
//						   System.out.println(k + "/ " + j + "/" + i);
//						   break Loop1;
//					   }else if(sum3 > n) continue Loop3;
//					   Loop4 :
//						   for(int l = (int) Math.sqrt(n); l > 0; l--) {
//							   int sum4 = sum3;
//							   sum4 += Math.pow(l, 2);
//
//							   if(sum4 == n) {
//								   cnt = 4;
//								   break Loop1;
//							   }else if(sum4 > n) continue Loop4;
//						}	
//				 }
//	   
//		   }	
//    
//	   }
//	   System.out.println(cnt);
//   }
}