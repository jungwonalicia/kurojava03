package java08;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CalWindow {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField result;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel label = new JLabel("숫자1>> ");
		label.setFont(new Font("굴림", Font.BOLD, 21));
		label.setForeground(Color.BLUE);
		label.setBackground(Color.WHITE);
		f.getContentPane().add(label);

		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(n1);
		n1.setColumns(10);

		JLabel label_2 = new JLabel("숫자2>> ");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("굴림", Font.BOLD, 21));
		label_2.setBackground(Color.WHITE);
		f.getContentPane().add(label_2);

		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.BOLD, 22));
		n2.setColumns(10);
		f.getContentPane().add(n2);

		JButton add = new JButton("더하기 연산");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 버튼을 누르셨군요.!!");
				String num1 = n1.getText(); // 입력값 가지고 옴.
				String num2 = n2.getText(); // 입력값 가지고 옴.
				System.out.println("입력한 숫자값1: " +  num1);
				System.out.println("입력한 숫자값2: " +  num2);
				
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sum = n11 + n22;
				System.out.println("두 수를 더한 값은 " + sum);
				result.setText(sum + "");
			}
		});
		add.setForeground(Color.BLUE);
		add.setBackground(Color.MAGENTA);
		add.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(add);
		
		JButton minus = new JButton("빼기 연산");
		minus.setForeground(Color.BLUE);
		minus.setFont(new Font("굴림", Font.BOLD, 25));
		minus.setBackground(Color.MAGENTA);
		f.getContentPane().add(minus);

		result = new JTextField();
		result.setForeground(Color.RED);
		result.setBackground(Color.YELLOW);
		result.setFont(new Font("궁서", Font.BOLD, 36));
		f.getContentPane().add(result);
		result.setColumns(6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\limjw\\java08\\cal.png"));
		f.getContentPane().add(lblNewLabel);
		f.setFont(new Font("Dialog", Font.BOLD, 18));
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\limjw\\java08\\cal.png"));
		f.setTitle("나의 계산기");

		f.setSize(355, 381);
		f.setVisible(true);
	}

}
