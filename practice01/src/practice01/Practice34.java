package practice01;
import java.io.*;
public class Practice34 {

	public static void main(String[] args) throws IOException
	{
		System.out.printf("��� �Է����ּ���!!  ----- >>>");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String str1 = str.toLowerCase();
		
		System.out.println("�빮�ڷ� ��ȯ�ϸ�" + stru + "�Դϴ�.");
		System.out.println("�ҹ��ڷ� ��ȯ�ϸ�" + str1 + "�Դϴ�.");
		
		System.out.printf("���ڿ��� �Է��� �ֽʽÿ�!! ---->>>>");
		
		String str2 = br.readLine();
		
		System.out.println("�ȳ��Ͻʴϱ�. �˻�� �Է��Ͻʽÿ�.");
		
		String str3 = br.readLine();
		char ch = str3.charAt(0);
		
		int num = str2.indexOf(ch);
		
		if(num != -1) {
			System.out.println(str2 + "��" + (num+1) + "��°���� " + ch + "��(��) �߰��߽��ϴ�.");
		} else {
			System.out.println(str1 + "���� " + ch + "��(��) ã�� �� �������ϴ�.");
		}
	
	}

}
