package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) throws IOException {
		
		byte[] buffer = new byte[5];
		
		File target = new File("files", "single2.kh");
		FileInputStream in = new FileInputStream(target);
		
		in.read(buffer);
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer);
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer);
		System.out.println(Arrays.toString(buffer));
		
		
		
		in.close();
		
	}
}
