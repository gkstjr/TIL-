package api.io.file;

import java.io.File;
import java.io.IOException;

public class Test03 {
public static void main(String[] args) throws Exception {
	File target = new File("files","test.kh");
	System.out.println(target.exists());
	System.out.println(target.isFile());
	System.out.println(target.isDirectory());
	
	try {
	boolean result =target.createNewFile();
	System.out.println(result);
	} catch (IOException e) {
		System.out.println("파일 생성 오류");
	}
	Thread.sleep(5000l);

	target.delete();

}
}
