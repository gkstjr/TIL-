package api.io.net2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Client01 {
public static void main(String[] args) throws UnknownHostException, IOException {
	
	Socket socket = new Socket("127.0.0.1",30000);

	
	byte[] b = new byte[5];
	socket.getInputStream().read(b);
	socket.close();
	System.out.println(Arrays.toString(b));

}
}
