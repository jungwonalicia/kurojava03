package array;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 첫 그래픽 프로그램");
		f.setSize(500, 500);
		JButton button = new JButton();
		button.setText("나를 눌러요.....");
		f.add(button);
		JButton button2 = new JButton();
		button2.setText("나를 또또또또또또또 눌러요.....");
		f.add(button2);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		f.setVisible(true);
		
	}

}
