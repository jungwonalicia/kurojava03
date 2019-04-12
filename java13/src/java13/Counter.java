package java13;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
public class Counter {
	static int count; //자동 초기화
	
	public static void main(String[] args) {
		//int count = 0;
		
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300);
		
		JLabel number = new JLabel("0");
		number.setBackground(Color.GREEN);
		Font font = new Font("궁서", Font.BOLD, 150);
		number.setFont(font);
		number.setForeground(Color.red);
		
		JButton b1 = new JButton("1 더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //count = count + 1
				number.setText(count + "");
			}
		});
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("1 빼기");
		b1.setBackground(Color.green); 
		b1.setForeground(Color.black); 
		b2.setBackground(Color.blue); 
		b2.setForeground(Color.white); 
		b3.setBackground(Color.green); 
		b3.setForeground(Color.black); 
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(number);
		
		f.setVisible(true);		
	}

}
