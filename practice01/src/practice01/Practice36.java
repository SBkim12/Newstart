package practice01;
import java.io.*;
public class Practice36 {

	public static void main(String[] args) throws IOException
	{
		int num = (int) (Math.random()*6)+1;
		System.out.println(num + "는 주사위 6의 값중 하나이다.");
		
		System.out.println("정수를 2개 입력하십시오.");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1, num2);
		
		System.out.println(num1 + "와(과) " + num2 + "중 큰쪽은" + ans + "입니다.");
		
	}
}
