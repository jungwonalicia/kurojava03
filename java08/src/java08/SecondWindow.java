package java08;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setTitle("나의 메뉴판");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\limjw\\java08\\ham2.jpg"));
		f.setBackground(Color.YELLOW);
		f.setSize(485, 435);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button = new JButton("나를 눌러요!!!!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군요....");
			}
		});
		button.setFont(new Font("함초롬돋움", Font.BOLD, 40));
		button.setToolTipText("내가 보이나요.");
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("햄버거 버튼을 누르셨군요..!!!");
			}
		});
		button_1.setIcon(new ImageIcon("D:\\limjw\\java08\\ham1.png"));
		f.getContentPane().add(button_1);
		
		
		
		
		f.setVisible(true);
	}

}
