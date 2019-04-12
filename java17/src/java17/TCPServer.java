package java17;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//1. 클라이언트로부터의 요청만을 담당하는 서버소켓 생성
		ServerSocket server = new ServerSocket(9100);
		System.out.println("TCP서버가 시작되었습니다.");
		System.out.println("요청을 기다리는 중....");
		//2. 서버소켓이 연결을 승인하면
		//3. 서버와 클라이언트가 연결이 생성(소켓--소켓)
		while (true) {
			Socket socket = server.accept();
			System.out.println("서버 소켓이 생성되었습니다.");
		}
		
		//4. 데이터 전송,데이터 보내고, 데이터 받음.
		//5. 연결해제
		
		
	}

}
