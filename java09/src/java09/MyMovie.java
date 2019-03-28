package java09;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyMovie {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 영화 앨범");
		f.setSize(303, 461);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\limjw\\java09\\1.png"));
		f.getContentPane().add(label);
		
		JButton b1 = new JButton("어스");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1)어스 이미지를 2)라벨에 icon으로 집어 넣는다.
				ImageIcon icon = new ImageIcon("1.png");
				label.setIcon(icon);
			}
		});
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("돈");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1)돈 이미지를 2)라벨에 icon으로 집어 넣는다.
				ImageIcon icon = new ImageIcon("2.png");
				label.setIcon(icon);
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("캡틴 마블");
		f.getContentPane().add(b3);
		
		f.setVisible(true);		
	}

}
