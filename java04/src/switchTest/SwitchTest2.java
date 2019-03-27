package switchTest;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//프로그램의 입출력 데이터 타입은 String이다.!!!!
		System.out.print("오늘의 날씨는 >>>> ");
		String input = sc.next();
		System.out.println("당신의 입력값은 " + input);
		
		switch (input) {
		case "sun":
			System.out.println("모자를 챙겨가요.");
			break;
		case "rain":
			System.out.println("우산을 챙겨가요.");
			break;
		default:
			System.out.println("마스크를 끼고가요.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}

}




