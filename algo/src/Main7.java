import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main7 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        String input;
	        while((input = br.readLine()) != null) {
	            String[] param = input.split(" ");
	            int a = Integer.parseInt(param[0]);
	            int b = Integer.parseInt(param[1]);
	            sb.append(a+b).append('\n');
	        }
	        System.out.print(sb);
	}
}	
