package java14;

import java.util.Random;

public class RandomSeedTest {

	public static void main(String[] args) {
		Random	random = new Random(1);
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(100));
		}
	}

}
