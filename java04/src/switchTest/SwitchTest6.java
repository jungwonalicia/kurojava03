package switchTest;

import java.util.Scanner;

public class SwitchTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 회사ID를 입력하세요.>>>> ");
		String id = sc.next();
		
		char dept = id.charAt(0);
		switch (dept) {
		case 'i':
			System.out.println("IT부서 이군요.");
			break;
		case 'p':
			System.out.println("기획부서 이군요.");
			break;
		case 's':
			System.out.println("특별부서 이군요.");
			break;
		default:
			System.out.println("해당 부서가 없어요.");
			break;
		}
		
		
		
	}

}




