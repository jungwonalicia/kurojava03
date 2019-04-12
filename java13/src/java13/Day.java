package java13;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	public void test() {
		System.out.println("일반 메소드 호출됨.");
	}
	//static메소드는 static변수 쓸 수 있다.!!!!
	public static int avgTime() {
		return sum/count;
	}
	
	public Day(String doing, int time, String location) {
		sum = sum + time;
		count++; //증감연산자 count = count + 1;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	//메뉴 Source -> Generate Constructor with Fields
	//단축키 -> 알트 + 쉬프트 + s + o
}
