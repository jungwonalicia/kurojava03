package java16;

public class 스레드User {

	public static void main(String[] args) {
		나는스레드 나는 = new 나는스레드();
		나는스레드2 나도 = new 나는스레드2();
		나는.start(); //run()메소드
		나도.start();
	}

}
