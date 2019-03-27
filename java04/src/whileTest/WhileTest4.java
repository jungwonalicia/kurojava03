package whileTest;

import java.util.Random;
import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		// 컨트롤+쉬프트+f(자동정렬)
		// 어떤 수: Random
		Random random = new Random();
			
		int target = random.nextInt(100);  //int값 아무거나 발생
				
		Scanner	sc = new Scanner(System.in);
		int count = 0; //try한 횟수
		while (true) {
			count++;
			//계속 입력받고.
			System.out.print("생각한 숫자를 입력>>>> ");
			int input = sc.nextInt();
			//입력값이 정답인지 확인...
			if(input == target) {
				System.out.println("축하합니다..정답입니다..");
				break;
			}else {
				System.out.println("다시 입력하세요..");
				if(input > target) {
					System.out.println("더 작은 수를 입력해주세요..");
				}else {
					System.out.println("더 큰 수를 입력해주세요..");
				}//else
			}//else
		}//while
		System.out.println("당신의 시도횟수는: " + count + "회");
	}//main
}//class




