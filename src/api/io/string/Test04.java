package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		
		File target= new File("files","string3.kh");
		FileReader reader = new FileReader(target);
		
		char[] buffer = new char[5];
		
		int size = reader.read(buffer);
		System.out.println();
		
	}
}
