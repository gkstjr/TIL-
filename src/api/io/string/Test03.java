package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03 {
	public static void main(String[] args) throws IOException {

		File target = new File("files","string3.kh");
		FileWriter writer = new FileWriter(target);
		BufferedWriter buffer = new BufferedWriter(writer);
		PrintWriter printer = new PrintWriter(buffer);
		
		printer.println("hello java");
		printer.println("한석아 열심히만 하면 돼");
		printer.println("하루하루 해내가는게 중요해");
		
		printer.close();
	}
}
