package java05;

import javax.swing.JOptionPane;

public class ArrayTest6 {

	public static void main(String[] args) {
		String[] names = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			names[i] = JOptionPane.showInputDialog("이름 입력");
		}
		
		for (int i = 0; i < names.length; i++) {
			//System.out.println(names[i]);
			if(names[i].equals("박아무개")) {
				System.out.println("박아무개가 있어요.");
				break;
			}else {
				//System.out.println("박아무개가 없어요.");
			}
		}
	}

}
