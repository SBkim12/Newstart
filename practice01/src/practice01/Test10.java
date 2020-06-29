package practice01;
import java.io.*;
public class Test10 {

	public static void main(String[] args) throws IOException {
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		System.out.println("a가 들어갈 위치를 정수로 입력하십시오");
		String str2 = br.readLine();
		int num = Integer.parseInt(str2);
		StringBuffer str3 = new StringBuffer(str1);
		str3.insert(num, 'a');
		
		System.out.println(str3 + "이 되었습니다.");

	}

}
