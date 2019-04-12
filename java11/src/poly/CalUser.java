package poly;

public class CalUser {

	public static void main(String[] args) {
		Cal cal = new Cal();
		System.out.println(cal.add(100, 200));
		System.out.println(cal.add(10.1, 20.2));
		System.out.println(cal.add("your id: ", 1000));
		System.out.println(cal.add("i am happy...", "really??"));
	}

}
