package input;

import java.util.Scanner;

public class InputStart {

	public static void main(String[] args) {
		System.out.println("나는 기본 출력");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요...");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name);
		
	}
}







