package db.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintUserInfo {

	public static void main(String[] args) throws Exception {


		//�Է¹޴� ���� �����ϱ� ���� ��ü ���� 
		Map<String, String> pMap = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("------------------------");
		System.out.print("ȸ�� ���̵� �Է��Ͻÿ� : "); pMap.put("user_id", sc.next());


		System.out.println("------------------------");
		System.out.print("ȸ�� �̸��� �Է��Ͻÿ� : "); pMap.put("user_nm", sc.next());

		System.out.println("------------------------");
		System.out.print("�̸����� �Է��Ͻÿ� : "); pMap.put("email", sc.next());

		System.out.println("------------------------");
		System.out.print("�ּҸ� �Է��Ͻÿ� : "); pMap.put("addr", sc.next());

		//����� ������ �޸� ���� 
		sc.close();

		//db����� ���� ��ü�� �޸𸮿� �ø� 
		DBinsert dbI = new DBinsert();

		//db����� ���� �Լ� ȣ�� 
		dbI.doInsert(pMap);

		//����� ������ �޸� ���� 
		pMap= null;

		// ȸ�� ������ �������� ���� DBUserInfo ��ü�� �޸𸮿� �ø�
		DBUserInfo ui = new DBUserInfo();

		// ȸ�� ���� ��������
		List<Map<String, String>> rList = ui.getUserInfo();

		// rList = ui.getUserInfo(); �Լ����� �߻� �� ���̺� ��ȸ ����� ������ NullPointer ������ �߻��ϴ°���
		// ���� �ϱ� ���� ���� �޸� �ø�
		if (rList == null) {
			rList = new ArrayList<Map<String, String>>();
		}

		System.out.println("------------------------");
		System.out.println("ui.getUserInfo() �Լ��κ��� ���޹��� ȸ�� ������ ����մϴ�.");
		System.out.println("------------------------");

		Iterator<Map<String, String>> it = rList.iterator();

		while (it.hasNext()) {

			Map<String, String> rMap = it.next();

			// ����ġ ���� ������ �޸𸮿� �������� ���� ��츦 ����ϱ� ���� ������ �޸� �ø�
			if (rMap == null) {
				rMap = new HashMap<String, String>();
			}

			// ���ڵ��� �� Į���� ���� ���
			System.out.println("���̵� : " + rMap.get("user_id"));
			System.out.println("�̸� : " + rMap.get("user_nm"));
			System.out.println("�̸��� : " + rMap.get("email"));
			System.out.println("�ּ� : " + rMap.get("addr"));
			System.out.println("������ : " + rMap.get("reg_dt"));
			System.out.println("----------------------------");

			// ����� ������ �޸� ����

			rMap = null;
		}
		// ����� ������ �޸� ����
		rList = null;
	}

}
