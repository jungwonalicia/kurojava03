public class ExceptionTest {
	public void call() throws Exception{
		int[] num = {1, 2, 3};
		num[3] = 4; //에러 발생(중단)
		
		System.out.println("여기가 출력이 될까요..");
	}
}	