public class ExceptionUser {

	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		try {
			test.call();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
