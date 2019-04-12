package construct;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Diary {
	private JTextField t1;
	private JTextField t2;
	public Diary() {
		JFrame f = new JFrame("일기 쓰는 프레임..");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(510, 519);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("<<<<< 일기작성날짜 >>>>>");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		f.getContentPane().add(separator);
		
		JLabel label = new JLabel("<<<<< 일기작성제목 >>>>>");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setBackground(Color.YELLOW);
		t2.setFont(new Font("굴림", Font.BOLD, 18));
		t2.setColumns(10);
		f.getContentPane().add(t2);
		
		JSeparator separator_1 = new JSeparator();
		f.getContentPane().add(separator_1);
		
		JLabel label_1 = new JLabel("<<<<< 일기작성내용 >>>>>");
		label_1.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(label_1);
		
		JTextArea t3 = new JTextArea();
		t3.setForeground(Color.BLUE);
		t3.setBackground(Color.YELLOW);
		t3.setFont(new Font("Monospaced", Font.BOLD, 18));
		t3.setColumns(40);
		t3.setRows(10);
		f.getContentPane().add(t3);
		
		JButton button = new JButton("파일에 저장하기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				System.out.println(date);
				System.out.println(title);
				System.out.println(content);
				
				FileWriter file;
				try {
					file = new FileWriter(date+".txt");
					file.write(date+"\n");
					file.write(title+"\n");
					file.write(content+"\n");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.RED);
		button.setFont(new Font("굴림", Font.BOLD, 27));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("파일에서 읽어오기");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.BLUE);
		button_1.setFont(new Font("굴림", Font.BOLD, 27));
		f.getContentPane().add(button_1);
		f.setVisible(true);
	}
}
