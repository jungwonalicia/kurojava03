package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] eyes = {2, 1.5, 0.8, 0.5, 1.2};
		System.out.println(eyes.length);
		eyes[0] = 1.7;
		
		for (double d : eyes) {
			System.out.println(d);
		}
		
		double[] eyes2 = {2, 1.5, 0.8, 0.5, 1.2};
		String[] names 
		  = {"김아무개", "박아무개", "송아무개", "정아무개", "이아무개"};
		
		
		for (int i = 0; i < eyes2.length; i++) {
			System.out.println(names[i] + ":" + eyes2[i]);
		}
		
	}

}
