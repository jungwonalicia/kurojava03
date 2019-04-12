package java17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		//1. 소켓이 필요.
		DatagramSocket socket 
			= new DatagramSocket(5000);
		System.out.println("서버로 부터 데이터 전송 수신 준비 끝...");
		//2. 패킷이 필요.
		//3. 바이트 배열 필요.
		byte[] data = new byte[256];
		
		DatagramPacket packet 
			= new DatagramPacket(data, data.length);
		
		socket.receive(packet);
		System.out.println("서버로 부터 받은 데이터는 " + new String(data));
		System.out.println("서버로 부터 데이터 전송 수신 완료...");
		
	}
}
