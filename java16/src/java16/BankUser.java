package java16;

public class BankUser {

	public static void main(String[] args) {
		GoodBank good = new GoodBank();
		BadBank bad = new BadBank();
		
		good.이자율계산();
		good.인사를잘함();
		
		System.out.println();
		
		bad.이자율계산();
		bad.적금이자율지급();
		
	}

}
