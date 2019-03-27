package whileTest;

public class WhileTest3 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0; 
		while(num <= 1000) {
			sum = sum + num;
			num++; 
		}
		System.out.println("ÃÑ ÇÕÀº " + sum);
	}

}
