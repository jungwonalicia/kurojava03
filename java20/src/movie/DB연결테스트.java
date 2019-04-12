package movie;

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
		System.out.print("검색할 아이디 입력>> ");
		String id = sc.next();
		
		String sql = "select * from movie where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		System.out.println("3. SQL문 객체화 성공..");
		
		//4. SQL문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공..");
		
		while(rs.next()) {
			String id2 = rs.getString(1);
			String title = rs.getString(2);
			String director = rs.getString(3);
			String content = rs.getString(4);
			String img = rs.getString(5);
			
			System.out.println("검색된 id: "  +  id2);
			System.out.println("검색된 title: "  +  title);
			System.out.println("검색된 director: "  +  director);
			System.out.println("검색된 content: "  +  content);
			System.out.println("검색된 img: "  +  img);
		}
		
		
		
		
		
		
		
		
		
	}
}
