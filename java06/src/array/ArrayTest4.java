package array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] num = new int[5];
		
		//1. 5명의 학생들에 대한 성적을 입력받고 싶습니다.
		for (int i = 0; i < 5; i++) {
			//2. 입력: 이름 + 점수
			System.out.println("이름을 입력하세요...");
			name[i] = sc.next();
			System.out.println("점수를 입력하세요...");
			num[i] = sc.nextInt();
		}
		//전체 출력
		for (int i = 0; i < num.length; i++) {
			System.out.println(name[i] + " : " + num[i]);
		}
		
		//3. 전체 학생의 평균을 내고 싶습니다.
		int sum = num[0] + num[1] + num[2] + num[3] + num[4];
		System.out.println("학생들의 평균은 : " + sum/5.0);
	}
}

