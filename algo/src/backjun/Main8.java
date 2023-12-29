package backjun;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main8 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   StringBuilder sb = new StringBuilder();
		   
		   int n = Integer.parseInt(br.readLine());
		   int firstNum = n;
		   int T = 0;
		   int count =0;
		   while(true) {
			   n = ((n % 10) *10) + (((n/ 10) + (n % 10)) % 10);
			   count++;
			   if(firstNum == n) break;
		   }
		   
		   sb.append(count).append("\n");
		   System.out.println(sb);
		 
		   
	}
}	
