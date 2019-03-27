
public class ArrayTest5 {

	public static void main(String[] args) {
//	1) 숫자를 배열에 넣는다.
	int[] num = {33, 5, 77, 88, 12, 44};
	int min = num[0];
	
//	2) 반복문으로 순회한다.
	for (int i = 0; i < num.length; i++) {
	//	3) 조건문으로 최소값인지 확인해서
	//	   더 작으면 최소값을 저장하는 변수에 옮겨준다.
		if(num[i] < min) {
			min = num[i];
		}
	}
//	4) 최종적으로 최소값을 저장하는 변수에는 최소값이 저장되어 있을 것임.
	System.out.println("제일 작은 숫자는 " + min);
	}

}
