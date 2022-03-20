package api.io.net5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1",30000);
		
		BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		DataInputStream data = new DataInputStream(buffer);
		
		int d1 = data.readInt();
		int d2 = data.readInt();
		
		
		socket.close();
		if(d1!=d2) {
			
		int big = Math.max(d1, d2);
		int small = Math.min(d1, d2);
		System.out.println("주사위1 = " +big +", 주사위2 = "+small);
		}else {
			System.out.println("둘다 " + d1 + "입니다");
		}
		
	}
}
