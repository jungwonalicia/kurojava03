package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] num = new int[5]; //0~4까지의 index
		//이 배열의 이름은 num!!
		num[0] = 1;
		num[2] = 3;
		num[4] = 5;
		
		System.out.println(num.length); //배열의 개수
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "인덱스 값: " + num[i]);
		}
	}

}
