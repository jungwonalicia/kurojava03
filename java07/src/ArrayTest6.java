import java.util.Arrays;

public class ArrayTest6 {

	public static void main(String[] args) {
		//1.¹è¿­
		int[] num = {44, 77, 22, 33, 99, 11};
		Arrays.sort(num);
		
		//2.for
		for (int i = 0; i < num.length; i++) {
			//3.if
			if(num[i] == 11) {
				//4.print
				System.out.println(i + 1 +"µî");
			}
		}
	}

}
