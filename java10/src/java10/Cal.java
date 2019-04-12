package java10;

public class Cal {
	int today = 300;
	//부품(class) => 원형
	//정적특징-> 변수(멤버변수, 전역변수, 자동초기화)
	//동적특징-> 메소드(접근제어자, 반환값, 입력값) 
//	public void call() {
//		System.out.println("호출됨...");
//	}
	//더하기
	public int add(int x, int y) {
		today++;
		return x + y;
//		return 100;
//		int z = x + y;
//		return z;
	}
	//빼기
	public int minus(int x, int y) {
		//name;
		return x - y;
	}
	//곱하기
	
	public int mul(int price, int count) {
		return price * count;
	}
	
	//나누기
	public int div(int sum, int person) {
		return sum / person;
	}
	
//	welcome메소드: 입력값 손님이름park
//	출력=> park님 환영합니다.
	public void welcome(String name) {
		System.out.println(name + "님 환영합니다.");
	}
//
//	point메소드: 입력값 손님이름, 포인트
//	출력=> park님의 포인트는 1000원입니다.
	public void point(String name, int point) {
		System.out.println(name + "님의 포인트는 " + point + "원입니다." );
	}
	
	
	
	
	
	
		
}
