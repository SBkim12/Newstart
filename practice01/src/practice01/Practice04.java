package practice01;

import java.io.*;
public class Practice04 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("���° �ڽ��� ���� �Ͻðڽ��ϱ�?");
		System.out.println("������ �Է��ϼ���.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		 
		char ans = (res == 1)? 'A' : 'B';
		
		System.out.println(ans + "�ڽ��� �����߽��ϴ�.");
	}

}
