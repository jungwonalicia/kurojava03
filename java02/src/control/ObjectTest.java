package control;
import java.lang.*;
import java.util.Date;

public class ObjectTest {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재 시각은 " + hour);
		System.out.println(date.getDay());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
	}

}
