package java05;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		//입력-다이얼로그
		String name 
		 = JOptionPane.showInputDialog("당신의 이름을 입력:");
		//출력-콘솔
		System.out.println("당신이 입력한 이름은 >> " + name);
		
	}

}
