package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test05 {
	public static void main(String[] args) throws IOException {
		
		Student st = new Student("피카츄",50,"낙성대역 김한석");
		File target= new File("files","student.kh");
		FileOutputStream in = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(in);
		ObjectOutputStream data = new ObjectOutputStream(buffer);
		
		data.writeObject(st);
		data.close();
	}
}
