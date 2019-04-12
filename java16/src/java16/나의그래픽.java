package java16;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 나의그래픽 extends JFrame {
	
	public 나의그래픽() {
		setSize(300, 300);
		setTitle("나의 전화기들....");
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		JTextField name = new JTextField(20);
		JButton button = new JButton("나를 눌러요...");
		
		add(name); //자동형변환(업캐스팅)
		add(button); //자동형변환(업캐스팅)		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		나의그래픽 name = new 나의그래픽();
	}
}
