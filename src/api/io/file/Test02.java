package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		
		File target = new File("files","sample.kh");
		
		System.out.println(target.exists());
		System.out.println(target.isFile());
		System.out.println(target.isDirectory());
		
		System.out.println(target.length());
		System.out.println(target.getName());
		System.out.println(target.getPath());
		System.out.println(target.getAbsolutePath());
		
		System.out.println(target.lastModified());
		Date d = new Date(target.lastModified());
		Format f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(f.format(d));
	}
}
