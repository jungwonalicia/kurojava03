package java16;

public class 나는스레드2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("나도 스레드>> " + i);
		}
	}
}
