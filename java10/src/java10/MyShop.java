package java10;
public class MyShop {
	public static void main(String[] args) {
		//계산기 필요..
		int milk = 2000;
		int coffee = 4000;

		//1.계산
		Cal cal = new Cal();
		int total = cal.add(milk, coffee);
		
		//2.영수증 발행.
		//전체지불금액 , 봄할인(1000), 할인 후 지불금액
		System.out.println("전체지불금액: " + total + "원");
		System.out.println("할인 후 지불금액: " + (total - 1000)+ "원");
		System.out.println("감사합니다. 다음에 또 들러주세요..");
		
		System.out.println("------------------------------");
		
		int icecream = 3000;
		int bread = 5000;
		
		//빵 2개, 아이스크림 3개.	//빵 가격 + 아이스크림 가격	//1.빵 가격
		int b = cal.mul(bread, 2);
		//2.아이스크림 가격
		int ice = cal.mul(icecream, 3);
		int sum = b + ice;
		
		System.out.println("전체 지불 금액: " + sum);
		//더치페이: sum / 5
		int each = cal.div(sum, 5);
		System.out.println("한 사람당 " + each + "원 내면됩니다.");
		System.out.println("-------------------------");
		
		cal.welcome("park");
		cal.point("park", 1000);
	}

}
