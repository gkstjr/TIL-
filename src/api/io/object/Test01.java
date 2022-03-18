package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test01 {
public static void main(String[] args) throws IOException {
	File dir = new File("files");
	dir.mkdirs();
	File target = new File("files","object1.kh");
	FileOutputStream out = new FileOutputStream(target);
	BufferedOutputStream buffer = new BufferedOutputStream(out);
	ObjectOutputStream data = new ObjectOutputStream(buffer);
	
	Date d = new Date();
	data.writeObject(d);

//	data.flush();
	data.close();
}
}
