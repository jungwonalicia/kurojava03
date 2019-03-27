package switchTest;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		System.out.println("이번 달은 : " + month);
		
		switch (month) { //실수X, 정수(longX)
		case 2:
			System.out.println("28일까지 있는 달입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있는 달입니다");
			break;
		default:
			System.out.println("31일까지 있습니다.");
			break;
		}
		
	}

}




