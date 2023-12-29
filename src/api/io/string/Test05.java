package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) throws IOException {
		
		File target = new File("files","string3.kh");
		FileReader reader = new FileReader(target);
		BufferedReader buffer = new BufferedReader(reader);
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			String line = buffer.readLine();
			if(line == null)break;
			sb.append(line);
			sb.append("\n");
		}
	buffer.close();
	
	System.out.println(sb.toString());
	
	}
}
