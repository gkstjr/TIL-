package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) throws IOException {
		
		String str = "안녕하세요 hello";
		byte[] b = str.getBytes();
		System.out.println(Arrays.toString(b));
		
		File target = new File("files","string.kh");
		FileOutputStream out = new FileOutputStream(target);
		
		out.write(b);
		out.close();
	}
}
