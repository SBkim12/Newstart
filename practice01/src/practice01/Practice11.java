package practice01;
import java.io.*;
public class Practice11 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("�� ��° ó���� �ǳ� �ٽðڽ��ϱ�?(1~10)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=10; i ++) {
			if(i ==res)
				//continue�� �ݺ�ó���� �ǳ� �� ����, ���� �۾��� �����Ѵ�.
				continue;
			System.out.println(i + "��° ó���Դϴ�.");
		}

	}

}
