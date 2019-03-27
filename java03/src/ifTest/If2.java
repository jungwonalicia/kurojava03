package ifTest;

import java.util.Date;
import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// 저기요!!!
		// ----------------------
		// 메뉴를 고르세요.
		// ----------------------
		// 1)짜장면, 2)짬뽕, 3)우동
		// ----------------------
		// 당신의 선택은? 1
		// 당신은 짜장면을 주문하셨습니다.
		Scanner sc = new Scanner(System.in);

		System.out.println("저기요!!!");
		System.out.println("----------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("----------------------");
		System.out.println("1)짜장면, 2)짬뽕, 3)우동");
		System.out.println("----------------------");
		System.out.print("당신의 선택은? >>> ");
		int choice = sc.nextInt();
		System.out.print("주문 수량은? >>> ");
		int count = sc.nextInt();
		
		int jajang = 4500;
		int jambong = 5000;
		int woodong = 5500;
		
		String food = null;
		int price = 0;
		
		if(choice == 1) {
			food = "짜장면";
			price = jajang * count;
		}else if(choice == 2) {
			food = "짬뽕";
			price = jambong * count;
		}else {
			food = "우동";
			price = woodong * count;
		}
		
		System.out.println("당신은 " + food + "을 선택하셨군요.");
		System.out.println("당신이 지불할 금액은 " + price + "원 입니다.");
		System.out.println("------------------------------");
		
		//내야할 금액이 10000원 이상이면, 2000원 할인.S
		if(price >= 10000) {
			System.out.println("당신이 내야할 금액을 할인해드리겠습니다.");
			System.out.println("당신이 최종 내야할 금액은 " + (price - 2000) + "원입니다.");
		}else {
			System.out.println("당신이 최종 내야할 금액은 " + price + "원입니다.");
		}
		
/*		if(choice == 1) {
			System.out.println("당신은 짜장면을 선택하셨군요.");
		}else if(choice == 2) {
			System.out.println("당신은 짬봉을 선택하셨군요.");
		}else {
			System.out.println("당신은 우동을 선택하셨군요.");
		}*/
	}

}
