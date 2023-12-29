package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

	File target = new File("files","object1.kh");
	FileInputStream in = new FileInputStream(target);
	BufferedInputStream buffer = new BufferedInputStream(in);
	ObjectInputStream data = new ObjectInputStream(buffer);
	
	Date d = (Date) data.readObject();
//	System.out.println(d);
	Format f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println(f.format(d));
	
	}
}
