package practice01;
import java.io.*;
public class Practice10 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("������ �Է��Ͻʽÿ�. (1~5)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
		case 1:
		case 2:
			System.out.println("���ݸ� �� ����սô�.");
			//break�� ó���� �帧�� ������ �����Ű��, �� ��Ͽ��� ���� ����
			break;
		case 3:
		case 4:
			System.out.println("�� ���̽��� �� ����սô�.");
			break;
		case 5:
			System.out.println("�ſ� ����մϴ�.");
			break;
		default:
			System.out.println("1~5������ ������ �Է��Ͻʽÿ�.");
			break;
		}

	}

}
