package java16;

public class BadBank extends Bank{

	//재정의해서 쓴다.
	@Override//오버라이드=overwrite(덮어씀)
	public void 이자율계산() {
		System.out.println("대출이자율이 20% ===");
	}
	
	public void 적금이자율지급() {
		System.out.println("적금 이자율이 낮다.");
	}
}
