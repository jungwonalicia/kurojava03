package java14;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("김아무개");
		list.add(100);
		list.add(55.555555);
		list.add(true);
		list.add('여');
		System.out.println(list);
		System.out.println(list.size());
		
	}

}
