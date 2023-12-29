package api.io.net9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		
		Socket socket = server.accept();
		
		Runnable r = () ->{
			try {
				BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while(true) {
					
				String line = buffer.readLine();
				if(line==null) break;
				System.out.println("수신->" + line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		Thread t = new Thread(r);
		t.setDaemon(true);
		t.start();
		
		Scanner sc = new Scanner(System.in);
		PrintWriter printer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		while(true) {
		String input = sc.nextLine();
		if(input.equals("종료"))break;
		printer.println(input);
		printer.flush();
		}
		
		
		sc.close();
		
		socket.close();
		
		server.close();
	}
}
