package practice01;
import java.io.*;
public class Practice35 {

	public static void main(String[] args) throws IOException
	{
		System.out.printf("���ڿ��� �Է����ּ���");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("�߰��� ���ڸ� �Է��Ͻʽÿ�.");
		
		String str2 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println(str1 + "�� " + str2 + "��(��) �߰��ϸ�" + sb + " �Դϴ�.");
	
	}

}
