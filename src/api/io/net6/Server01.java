package api.io.net6;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();

		OutputStreamWriter converter = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter printer = new PrintWriter(converter);
		
		printer.println("Hello java");
		printer.flush();
		
		printer.println("안녕 자바");
		printer.flush();
		
		socket.close();
		server.close();
	}
}
