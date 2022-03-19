package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class Test04_1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File target= new File("files","lotto2.kh");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream data = new ObjectInputStream(buffer);
		
		Lotto lotto = (Lotto) data.readObject();
	
		
		data.close();
		
		lotto.print();
	}
	}
