package generic;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericTest2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("감자", 1000);
		map.put("고구마", 2000);
		map.put("양파", 3000);
		
		System.out.println(map);
	}
}
