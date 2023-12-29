package api.io.net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost",30000);
		System.out.println("연결 완료");
		
//		서버와 데이터를 주고받는 코드
		socket.close();
		System.out.println("연결 종료");
		
	}
}
