package api.io.net2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(30000);
		
		Socket socket = server.accept();
	
		
		byte[] b = new byte[] {104,101,108,108,111};
		socket.getOutputStream().write(b);
		socket.close();
		
		server.close();
	}
}
