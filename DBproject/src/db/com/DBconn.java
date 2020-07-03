package db.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	public static Connection getDBConnection() throws Exception {
		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//주소입력
		String user = "MYUSER"; //아이디 입력
		String passwd = "1234"; //비번 입력
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			//주소에서의 아이디와 비번 입력 실행
			System.out.println("오라클 접속 성공!!");
		}catch(ClassNotFoundException e){
			System.out.println("오라클 접속 실패");
			System.out.println("ojbdc6.jar 파일에 존재하는 자바 파일을 찾지 못함");
			System.out.println("이유 :" + e.toString());
		}catch(SQLException e) {
			System.out.println("오라클 접속 실패");
			System.out.println("이유 : " + e.toString());
		}
		//오라클 DB와 연결된 자바 객체에 결과값을 전달한다.
		return conn;
	}

	/*
	 * 기존에 연결된 오라클 DB와 접속 해제하기 / 즉, 메모리에 올라간 Connection 객체를 메모리에 지우기
	 * 
	 * @param Connection 기존 오라클DB와 연결함 자바 객체
	 */
	public static void DBClose(Connection pConn) throws Exception{
		pConn.close();
	}

}
