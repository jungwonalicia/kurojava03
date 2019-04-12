package java14;

public class BoxingTest {

	public static void main(String[] args) {
		Integer i1 = new Integer("200");
		int i2 = 100;
		
		i1 = i2;
		System.out.println(i1);
		
		i2 = i1;
		System.out.println(i2);
	}
}
