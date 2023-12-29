package api.io.net4;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		
		Socket socket = server.accept();
		
		int value = 12345;
		BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(buffer);
		
		data.writeInt(value);
		data.flush();
		
		
		socket.close();
		
		server.close();
	}
}
