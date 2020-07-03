package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.com.DBconn;

public class DBSelect {

	public static void main(String[] args) throws Exception{
		
		//����Ŭ �����ϱ�
		Connection conn = DBconn.getDBConnection();
		
		//����Ŭ���� SQl������ �����ϱ� ���� ��ü
		PreparedStatement pstmt = null;
		
		//SQL ����
		String sql = "SELECT COUNT(1) AS CNT FROM USER_INFO";
		
		// ����Ŭ�� ���޵� sql ó���� �����ϱ�
		pstmt = conn.prepareStatement(sql);
		
		//SQL ��ȸ ������ ����, rs ������ ����� �����ϱ�
		//ResultSet ��ü�� Map �ڷ� ����(Ű�� ������ ����)�� ����Ŭ�� �����ϵ��� ������ �ڹ� ��ü
		ResultSet rs = pstmt.executeQuery(sql);
		
		if(rs.next()) {
			
			String cnt = rs.getString("CNT");
			System.out.println("ȸ�������� �� CNT : " + cnt);
		}
		
		//����Ŭ�κ��� ���޹��� ����� ����� ������ �ٷ� �޸𸮸� �����ؾ���
		//�������� ������ ����Ŭ DB�� ��� ������ �����ǰ� �־� DB�� ������ ������
		rs.close();
		
		//����Ŭ DB ���� ����
		DBconn.DBClose(conn);
	}

}
