package java05;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] friends = {"김아무개", "박아무개", "송아무개" };
		System.out.println(friends.length);
		
		for (String f : friends) {
			System.out.println(f);
		}
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
	}
}
