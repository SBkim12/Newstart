package practice01;
import java.io.*;
public class Practice36 {

	public static void main(String[] args) throws IOException
	{
		int num = (int) (Math.random()*6)+1;
		System.out.println(num + "�� �ֻ��� 6�� ���� �ϳ��̴�.");
		
		System.out.println("������ 2�� �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1, num2);
		
		System.out.println(num1 + "��(��) " + num2 + "�� ū����" + ans + "�Դϴ�.");
		
	}
}
