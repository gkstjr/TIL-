package api.io.net6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
public static void main(String[] args) throws UnknownHostException, IOException {
	Socket socket = new Socket("127.0.0.1",30000);
	
	InputStreamReader converter = new InputStreamReader(socket.getInputStream());
	BufferedReader buffer = new BufferedReader(converter);
	
	String line1 = buffer.readLine();
	String line2 = buffer.readLine();
		
	socket.close();

	System.out.println(line1);
	System.out.println(line2);
}
}
