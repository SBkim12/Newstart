package practice01;
import java.io.*;
public class Test11 {

	public static void main(String[] args) throws IOException {
		System.out.println("정수를 2개 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.min(num1, num2);
		System.out.println(str1 + "과" + str2 + " 중 작은쪽은" + ans + "입니다.");
	}

}
