package input;

import java.util.Scanner;

public class InputStart2 {

	public static void main(String[] args) {
//		나의 정보 입력
		System.out.println("나의 정보 입력");
//		-----------
		System.out.println("-----------");
//		나이: 10
		System.out.print("나이: ");
		Scanner sc = new Scanner(System.in);
		String age = sc.next();
		
//		성별: man
		System.out.print("성별: ");
		String gender = sc.next();
		
//		이름: park
		System.out.print("이름: ");
		String name = sc.next();
//		-----------
		System.out.println("----------");
	}

}
