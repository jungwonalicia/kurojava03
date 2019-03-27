package java05;

import javax.swing.JOptionPane;

public class LoginTest {

	public static void main(String[] args) {
		String id2 = "root";
		String pw2 = "abcd";
		
		String id = JOptionPane.showInputDialog("ID 입력");
		String pw = JOptionPane.showInputDialog("PW 입력");
		
		test();
		if(id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 OK");
		}else {
			System.out.println("로그인 NOT");
		}
	}
	
	public static void test() {
		System.out.println("test");
	}

}
