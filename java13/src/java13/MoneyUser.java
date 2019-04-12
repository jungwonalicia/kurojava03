package java13;

public class MoneyUser {

	public static void main(String[] args) {
		Money girl1 = new Money("김아무개1", 15);
		System.out.println(girl1.money);
		Money girl2 = new Money("김아무개2", 10);
		System.out.println(girl2.money);
		
		System.out.println(Money.money);
	}
}
