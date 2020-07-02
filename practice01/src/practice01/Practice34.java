package practice01;
import java.io.*;
public class Practice34 {

	public static void main(String[] args) throws IOException
	{
		System.out.printf("영어를 입력해주세요!!  ----- >>>");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String str1 = str.toLowerCase();
		
		System.out.println("대문자로 변환하면" + stru + "입니다.");
		System.out.println("소문자로 변환하면" + str1 + "입니다.");
		
		System.out.printf("문자열을 입력해 주십시오!! ---->>>>");
		
		String str2 = br.readLine();
		
		System.out.println("안녕하십니까. 검색어를 입력하십시오.");
		
		String str3 = br.readLine();
		char ch = str3.charAt(0);
		
		int num = str2.indexOf(ch);
		
		if(num != -1) {
			System.out.println(str2 + "의" + (num+1) + "번째에서 " + ch + "을(를) 발견했습니다.");
		} else {
			System.out.println(str1 + "에서 " + ch + "을(를) 찾을 수 없었습니다.");
		}
	
	}

}
