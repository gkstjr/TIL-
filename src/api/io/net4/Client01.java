package api.io.net4;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		String ip = "127.0.0.1";
		int port = 30000;
		Socket socket = new Socket(ip,port);
		
//		데이터 입력을 위한 스트림 구성
		BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		DataInputStream data = new DataInputStream(buffer);
		
		int value = data.readInt();
		System.out.println(value);
		socket.close();
	}
}
