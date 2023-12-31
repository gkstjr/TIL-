package api.io.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		서버를 준비하는 코드
		
		ServerSocket server =new ServerSocket(30000);
		System.out.println("서버준비 완료");
		Socket socket = server.accept();
		System.out.println("사용자 접속");
		System.out.println(socket);
		socket.close();
		System.out.println("접속 종료");
		
		server.close();
		System.out.println("서버 종료");
	}
}
