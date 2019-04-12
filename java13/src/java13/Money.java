package java13;

public class Money {
	String name;
	int age;
	static int money = 10000;
	
	public Money(String name, int age) {
		this.name = name;
		this.age = age;
		money = money - 1000;
	}
}


