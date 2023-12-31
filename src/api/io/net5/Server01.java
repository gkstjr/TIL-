package api.io.net5;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		
		Random r = new Random();
		int d1 = r.nextInt(6)+1;
		int d2 = r.nextInt(6)+1;
		
		BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(buffer);
		
		data.writeInt(d1);
		data.writeInt(d2);
		data.flush();
		
		socket.close();
		server.close();
		
	}
}
