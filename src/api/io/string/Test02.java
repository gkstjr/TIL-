package api.io.string;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
		String str = "안녕하세요 hello";
		
		File target = new File("files","string2.kh");
		FileWriter writer = new FileWriter(target);
		
		writer.write(str);
		writer.write("\n");
		writer.write(str);
		writer.write("\n");
		writer.write(str);
		writer.write("\n");
		writer.write(str);
		writer.write("\n");
		writer.write(str);
		writer.write("\n");
		writer.close();
	}
}
