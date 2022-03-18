package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
public static void main(String[] args) throws IOException {
	
	File target = new File("files","single.kh");
	FileInputStream in = new FileInputStream(target);
	while(true){
		int a = in.read();
		if(a==-1)break; 
		System.out.println("a = " + a);
		
	}
	
}
}
