package db.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	public static Connection getDBConnection() throws Exception {
		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//�ּ��Է�
		String user = "MYUSER"; //���̵� �Է�
		String passwd = "1234"; //��� �Է�
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			//�ּҿ����� ���̵�� ��� �Է� ����
			System.out.println("����Ŭ ���� ����!!");
		}catch(ClassNotFoundException e){
			System.out.println("����Ŭ ���� ����");
			System.out.println("ojbdc6.jar ���Ͽ� �����ϴ� �ڹ� ������ ã�� ����");
			System.out.println("���� :" + e.toString());
		}catch(SQLException e) {
			System.out.println("����Ŭ ���� ����");
			System.out.println("���� : " + e.toString());
		}
		//����Ŭ DB�� ����� �ڹ� ��ü�� ������� �����Ѵ�.
		return conn;
	}

	/*
	 * ������ ����� ����Ŭ DB�� ���� �����ϱ� / ��, �޸𸮿� �ö� Connection ��ü�� �޸𸮿� �����
	 * 
	 * @param Connection ���� ����ŬDB�� ������ �ڹ� ��ü
	 */
	public static void DBClose(Connection pConn) throws Exception{
		pConn.close();
	}

}
