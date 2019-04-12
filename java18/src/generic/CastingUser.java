package generic;

public class CastingUser {

	public static void main(String[] args) {
		Casting1 c1 = new Casting1(100, 200);
		System.out.println(c1.x);
		System.out.println(c1.y);
		int xx = (int)c1.x; 
		int yy = (int)c1.y; 
		//강제형변환(Object-->Interger-->int)
		System.out.println(xx + yy);
		System.out.println("---------------");
		Casting1 c2 = new Casting1("감자", "고구마");
		System.out.println(c2.x);
		System.out.println(c2.y);
		String xx2 = (String)c2.x;
		String yy2 = (String)c2.y;
		System.out.println(xx2 + yy2);
	}
}
