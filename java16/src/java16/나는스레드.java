package java16;

public class 나는스레드 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("나는 스레드: " + i);
		}
	}
}
