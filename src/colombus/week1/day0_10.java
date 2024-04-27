package colombus.week1;

import java.io.*;
import java.util.StringTokenizer;
public class day0_10 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toCharArray();
		int cnt = 0;
		String str = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < ch.length; i++) {
			
			str += ch[i];
			cnt++;
			if(cnt == 10) {
				sb.append(str).append("\n");
				str = "";
				cnt = 0;
			}
		}
		
		if(str != "") {
			sb.append(str);
		}
		
		System.out.println(sb);
	}
}
