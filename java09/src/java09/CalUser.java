package java09;

public class CalUser {

	public static void main(String[] args) {
		Cal cal = new Cal();
		String result = cal.call();
		System.out.println(result);
		System.out.println(cal.call());
		
		int result2 = cal.add(200, 100);
		System.out.println(result2);
		
	}

}
