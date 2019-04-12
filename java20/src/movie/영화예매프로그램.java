package movie;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class 영화예매프로그램 extends JFrame implements ActionListener{
	private JTextField id, title, director, content;
	public JLabel img; //이미지 넣어주려고 label로 변경.
	//선언은 메모리 할당
	
	public 영화예매프로그램() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("나의 영화예매프로그램");
		setSize(632, 484);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel jId = new JLabel("아이디: ");
		jId.setFont(new Font("굴림", Font.BOLD, 36));
		JLabel jTitle = new JLabel("타이틀: ");
		jTitle.setFont(new Font("굴림", Font.BOLD, 36));
		JLabel jDirector = new JLabel("디렉터: ");
		jDirector.setFont(new Font("굴림", Font.BOLD, 36));
		JLabel jContent = new JLabel("컨텐츠: ");
		jContent.setFont(new Font("굴림", Font.BOLD, 36));
		JLabel jImg = new JLabel("이미지: ");
		jImg.setFont(new Font("굴림", Font.BOLD, 36));
		
		id = new JTextField(15);
		id.setForeground(Color.BLUE);
		id.setFont(new Font("굴림", Font.BOLD, 30));
		title = new JTextField(15);
		title.setForeground(Color.BLUE);
		title.setFont(new Font("굴림", Font.BOLD, 30));
		director = new JTextField(15);
		director.setForeground(Color.BLUE);
		director.setFont(new Font("굴림", Font.BOLD, 30));
		content = new JTextField(15);
		content.setForeground(Color.BLUE);
		content.setFont(new Font("굴림", Font.BOLD, 30));
		img = new JLabel();
		
		JButton search = new JButton("영화 검색하기");
		search.setFont(new Font("굴림", Font.BOLD, 40));
		search.setBackground(Color.BLACK);
		search.setForeground(Color.YELLOW);
		
		getContentPane().add(jId);
		getContentPane().add(id);
		getContentPane().add(jTitle);
		getContentPane().add(title);
		getContentPane().add(jDirector);
		getContentPane().add(director);
		getContentPane().add(jContent);
		getContentPane().add(content);
		getContentPane().add(jImg);
		getContentPane().add(img);
		getContentPane().add(search);
		
		search.addActionListener(this);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		try {
			//db처리
			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user = "root";
			String password = "1234";
			//1. 커넥터(드라이버) 설정 => import 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터(드라이버) 설정 성공...");
			
			//2. DB연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공...");
			
			//3. SQL문 객체화
			String id2 = id.getText();
			
			String sql = "select * from movie where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id2);
			
			System.out.println("3. SQL문 객체화 성공..");
			
			//4. SQL문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 성공..");
			
			while(rs.next()) {
				String id3 = rs.getString(1);
				String title3 = rs.getString(2);
				String director3 = rs.getString(3);
				String content3 = rs.getString(4);
				String img3 = rs.getString(5);
				id.setText(id3);
				title.setText(title3);
				director.setText(director3);
				content.setText(content3);
				ImageIcon icon = new ImageIcon(img3);
				img.setIcon(icon);
			}
		}catch(Exception e) {
			System.out.println("DB처리시 에러 발생...");
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		영화예매프로그램 영화 = new 영화예매프로그램();
	}


}
