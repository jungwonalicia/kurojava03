package array;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� ù �׷��� ���α׷�");
		f.setSize(500, 500);
		JButton button = new JButton();
		button.setText("���� ������.....");
		f.add(button);
		JButton button2 = new JButton();
		button2.setText("���� �ǶǶǶǶǶǶ� ������.....");
		f.add(button2);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		f.setVisible(true);
		
	}

}
