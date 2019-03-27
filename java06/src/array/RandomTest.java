package array;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		//배열에 입력값을 받아서 저장--> 계산...
		
		//random값을 배열에 넣어봅시다.
		
		Random random = new Random(); //Math.random();
		int[] lotto = new int[6];
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = random.nextInt(46);
		}
		
		for (int x : lotto) {
			System.out.print(x + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
