package java19;
import java.sql.*;
import java.util.Scanner;
//java.sql.클래스들
//java.sql.폴더.클래스들
//=> import java.sql.폴더.*;

public class DB연결테스트 {
	
	public static void main(String[] args) throws Exception {
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
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력>> ");
		String id = sc.next();
		System.out.print("타이틀 입력>> ");
		String title = sc.next();
		System.out.print("디렉터 입력>> ");
		String director = sc.next();
		System.out.print("컨텐츠 입력>> ");
		String content = sc.next();
		System.out.print("이미지 입력>> ");
		String img = sc.next();
		
		String sql = "insert into movie values (?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, director);
		ps.setString(4, content);
		ps.setString(5, img);
		
		
		System.out.println("3. SQL문 객체화 성공..");
		
		//4. SQL문 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공..");
	}
}
