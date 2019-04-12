package construct;

public class Tv {
	String color;
	int size;
	String shape;
	
	//기본 생성자
	public Tv() {
	}
	
	public Tv(String c, int s, String sh) {
		color = c;
		size = s;
		shape = sh;
	}
	
	@Override
	public String toString() {
		return "Tv [color=" + color + ", size=" + size + ", shape=" + shape + "]";
	}

	public void powerOn() {
		System.out.println("전원을 켜다.");
	}
	public void powerOff() {
		System.out.println("전원을 끄다.");
	}
}
