package db.service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.com.DBconn;
public class DBinsert {

	public void doInsert(Map<String, String> pMap) {
		
		try{
		
			//����Ŭ �����ϱ�
			Connection conn = DBconn.getDBConnection();
			
			//����Ŭ�� SQL������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;
			
			//SQL ����
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR) VALUES(";
			sql += "?, "; // insert into ���������� ù��° �÷��� user_id�� ��Ī��
			sql += "?, ";// insert into ���������� �ι�° �÷��� user_nm�� ��Ī��
			sql += "?, ";// insert into ���������� ����° �÷��� email�� ��Ī��
			sql += "?) ";// insert into ���������� �׹�° �÷��� addr�� ��Ī��
						//(REG_DT)�� insert into ������ ��� ����
			
			//����Ŭ�� ���޵� SQL ������ �����ϱ�
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0; // ? ������ �����ϱ� ���� ����
			
			//���޹��� pMap ��ü�� ���� SQL ������ ?�� �����ϱ�
			
			String user_id = pMap.get("user_id");
			System.out.println("���޹��� id : " + user_id);
			pstmt.setString(++idx, user_id); //ù��° ?
			
			String user_nm = pMap.get("user_nm");
			System.out.println("���޹��� name : " + user_nm);
			pstmt.setString(++idx, user_nm); //�ι�° ?
			
			String email = pMap.get("email");
			System.out.println("���޹��� email : " + email);
			pstmt.setString(++idx, email); //����° ?
			
			String addr = pMap.get("addr");
			System.out.println("���޹��� addr : " + addr);
			pstmt.setString(++idx, addr); //�׹�° ?
			
			//insert ���� ����
			int res = pstmt.executeUpdate();
			
			if(res>0) {
				System.out.println("������ ��� ����!");
			}else {
				System.out.println("������ ��� ����!");
			}
			
			pstmt = null;
			
			//����Ŭ DB ���� ����
			DBconn.DBClose(conn);
			
		}catch(Exception e) {
			System.out.println(e.toString());
			
		}
	}

}
