public class ExceptionTest2 {
	public void call() {
		int[] num = {1, 2, 3};
		
		try {
			num[3] = 4; //에러 발생(중단)
		}catch(Exception e) {
			System.out.println("삐삐삐삐삐!! 에러발생..!! 체크하세요..");
			System.out.println("에러 내용: " + e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행되는 부분..");
			System.out.println("예) 파일을 close!!");
		}
		
		System.out.println("여기가 출력이 될까요..");
	}
}	