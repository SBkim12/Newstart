package practice01;
import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException
	{
		System.out.println("���� ������ �Է��Ͻʽÿ�. (0���� ����)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int sum = 0;
		
		do {
			String str = br.readLine();
			num = Integer.parseInt(str);
			sum += num;
		} while ( num != 0);
		
		System.out.println("������ �հ��" + sum + "�� �Դϴ�.");
	}

}
