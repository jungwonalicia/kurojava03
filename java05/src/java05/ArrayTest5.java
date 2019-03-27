package java05;

import javax.swing.JOptionPane;

public class ArrayTest5 {

	public static void main(String[] args) {
		String[] names = new String[3];
		
		names[0] = JOptionPane.showInputDialog("이름 입력");
		names[1] = JOptionPane.showInputDialog("이름 입력");
		names[2] = JOptionPane.showInputDialog("이름 입력");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
