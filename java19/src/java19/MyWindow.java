package java19;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow extends JFrame implements ActionListener{
	JButton b1, b2;
	
	public MyWindow() {
		setTitle("나의 윈도우");
		setSize(500, 500);
		
		
		
		
		b1 = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");
		
		b1.addActionListener(this);
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.RED);
		b1.setFont(new Font("굴림", Font.BOLD, 76));
		getContentPane().add(b1, BorderLayout.CENTER);
		getContentPane().add(b2);
		b2.setForeground(Color.BLUE);
		b2.setFont(new Font("굴림", Font.BOLD, 76));
		b2.setBackground(Color.YELLOW);
		
		getContentPane().setLayout(new FlowLayout());
		
		JButton b3 = new JButton("내가 세번째 버튼");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("세번째 버튼 클릭되었음.");
			}
		});
		b3.setForeground(Color.GREEN);
		b3.setFont(new Font("굴림", Font.BOLD, 55));
		b3.setBackground(Color.BLACK);
		getContentPane().add(b3);
		
		JButton b4 = new JButton("내가 마지막 버튼");
		b4.setForeground(Color.YELLOW);
		b4.setFont(new Font("굴림", Font.BOLD, 55));
		b4.setBackground(Color.BLACK);
		getContentPane().add(b4);
		b2.addActionListener(this);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("네번째 버튼 클릭되었음.");
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			System.out.println("내가 자동 호출됨.....");
		}
		if(e.getSource() == b2) {
			System.out.println("나도 자동 호출됨.....");
		}
	}
}




