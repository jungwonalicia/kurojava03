package java09;

public class Tv { //Tv 부품 => 클래스!
//	TV(클래스)
//	정적특징- 모양, 크기 => 변수
	String shape;
	int size;
	
//	동적특징- 켜다, 끄다, 바꾸다. => 메소드
	public void on() {
		System.out.println("TV를 켜다.");
	}
	public void off() {
		System.out.println("TV를 끄다.");
	}
	public void change() {
		System.out.println("채널을 바꾸다. ");
	}
	
	
}






