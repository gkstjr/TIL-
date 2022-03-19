package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws IOException {
		
		String filename = "note.kh";
		File target = new File("files",filename);
		FileWriter writer = new FileWriter(target);
		BufferedWriter buffer = new BufferedWriter(writer);
		PrintWriter printer = new PrintWriter(buffer);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		System.out.print("입력 : ");
		String line = sc.nextLine();
		if(line.equals("종료")) {
			Date d= new Date();
			Format f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			printer.println(f.format(d));
			break;
			
		}else {
			printer.println(line);
		}
		printer.flush();

		}
		
		sc.close();
		printer.close();
	}
}
