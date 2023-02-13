import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main18 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
			BufferedReader	 br = new BufferedReader(new InputStreamReader(System.in));
			
			br.readLine();
			
			int sum = 0;
			for(byte value : br.readLine().getBytes()) {
				sum += value - '0';
			}
			
			System.out.println(sum);
	}
}	
