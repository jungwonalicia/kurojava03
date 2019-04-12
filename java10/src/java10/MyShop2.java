package java10;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyShop2 {
	private static JTextField count;
	private static JTextField total;
	static int number = 0; //count변수

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setTitle("나의 주문 프로그램");
		f.setSize(703, 497);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel img = new JLabel("");
		
		JButton b1 = new JButton("짬뽕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("jambong.png");
				img.setIcon(icon);
				number++;
				count.setText(number + "");
				total.setText(number * 5000 + "");
			}
		});
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("굴림", Font.ITALIC, 18));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("우동");
		b2.setBackground(Color.PINK);
		b2.setFont(new Font("굴림", Font.ITALIC, 18));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("자장");
		b3.setBackground(Color.CYAN);
		b3.setFont(new Font("굴림", Font.ITALIC, 18));
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel = new JLabel("개수");
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("굴림", Font.ITALIC, 18));
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField();
		count.setBackground(Color.GREEN);
		count.setFont(new Font("굴림", Font.ITALIC, 18));
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("금액");
		lblNewLabel_1.setBackground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("굴림", Font.ITALIC, 18));
		f.getContentPane().add(lblNewLabel_1);
		
		total = new JTextField();
		total.setBackground(Color.GREEN);
		total.setFont(new Font("굴림", Font.ITALIC, 18));
		f.getContentPane().add(total);
		total.setColumns(10);
		
		
		img.setIcon(new ImageIcon("D:\\limjw\\java10\\main.png"));
		f.getContentPane().add(img);
		
		f.setVisible(true);
	}

}
