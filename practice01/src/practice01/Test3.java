package practice01;
import java.io.*;
public class Test3 {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("2 �̻��� ������ �Է��Ͻʽÿ�.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i =2; i<=res; i++) {
			if(i == res) {
				System.out.println( res + "�� �Ҽ��Դϴ�.");
			} else if( res % i == 0) {
				System.out.println( res + "�� �Ҽ��� �ƴմϴ�.");
				break;
			}
		}
		

	}

}
