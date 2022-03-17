package api.io.file;

import java.io.File;

public class Test01 {
public static void main(String[] args) {
	File a = new File("files","sample.kh");
	File b = new File("files/sample.kh");
	File c = new File("files\\sample.kh");
	
	System.out.println(a.exists());
	
}

	}
