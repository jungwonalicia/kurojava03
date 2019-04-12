
public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.fly = true; //superman
		sMan.power = "강"; //man
		sMan.name = "클라크"; //person
		
		sMan.eat(); //person
		sMan.run(); //man
		sMan.flyHigh(); //superman
		System.out.println(sMan);
	}
}
