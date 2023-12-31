package api.io.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test07 {
	public static void main(String[] args) throws IOException {
		
		File target = new File("files","note.kh");
		FileReader reader = new FileReader(target);
		BufferedReader buffer = new BufferedReader(reader);
		
		while(true) {
			String line = buffer.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		buffer.close();
	}
}
