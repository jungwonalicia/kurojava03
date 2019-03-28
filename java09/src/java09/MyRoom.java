package java09;

public class MyRoom {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.color = "노랑색";
		dog.tail = 10;
		System.out.println(dog.color + " " + dog.tail);
		dog.bark();
		dog.shake();		
		
		System.out.println("---------------");
		//tv 
		Tv tv = new Tv();
		//변수, 메소드
		
		tv.shape = "네모";
		tv.size = 20;
		
		System.out.println("모양은 " + tv.shape + ", " + "사이즈는 " + tv.size);
		tv.on();     //메소드를 사용(호출, call)
		tv.off();
		tv.change();
		
		System.out.println("---------------");
		
		Tv tv2 = new Tv();
		
		tv2.shape = "동글";
		tv2.size = 100;
		System.out.println("모양은 " + tv2.shape + ", " + "사이즈는 " + tv2.size);
		
		tv2.on();
		tv2.change();
		tv2.off();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
