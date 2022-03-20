package api.io.net9;

import java.awt.print.PrinterAbortException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {
public static void main(String[] args) throws UnknownHostException, IOException {
	
	Socket socket = new Socket("localhost",30000);
	
	Runnable r = ()-> {
		try {
		Scanner sc = new Scanner(System.in);
		PrintWriter printer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		while(true) {
		String input = sc.nextLine();
		if(input.equals("종료"))break;
		printer.println(input);
		printer.flush();
		} 
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	};
	
	Thread t = new Thread(r);
	t.setDaemon(true);
	t.start();
	
	
	BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	while(true) {
		
	String line = buffer.readLine();
	if(line.equals(null))break;
	System.out.println("수신 -> " + line);
	}
	
	
	socket.close();
}
}
