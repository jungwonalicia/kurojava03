package java16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DomainToIp {

	public static void main(String[] args) throws Exception  {
		//도메인 네임 --> ip(도메인 네임 서버)
		String domain = "www.kgitbank.com";
		String ip = "210.125.88.21";
		
		//1. ip를 알아내야함.=> class필요.
			InetAddress address = InetAddress.getByName(domain);
			System.out.println(address);
		
		
		
	}

}
