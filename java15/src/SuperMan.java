
public class SuperMan extends Man{
	//변수3, 메소드3
	
	boolean fly;

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	public void flyHigh() {
		System.out.println("높게 날다.");
	}
	
	
}
