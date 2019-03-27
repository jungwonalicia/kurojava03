package java05;

public class ArrayTest4 {

	public static void main(String[] args) {
		String[] names = new String[3];
		
		names[0] = "박아무개";
		names[1] = "정아무개";
		names[2] = "김아무개";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
