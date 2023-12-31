package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test06 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	File target= new File("files","student.kh");
	FileInputStream in = new FileInputStream(target);
	BufferedInputStream buffer = new BufferedInputStream(in);
	ObjectInputStream data = new ObjectInputStream(buffer);
	
	Student st	= (Student) data.readObject();

	
	data.close();
	
	System.out.println(st);
	}
}
