package practice01;

import java.io. *;

public class practice1	 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("정수를 2개 입력하십시오");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		double div = (float)num1 / (int)num2;
		System.out.printf("%d / %d = %1.2f 입니다. \n", num1 , num2, div);
	}
}
