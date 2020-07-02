package practice01;
import java.io.*;
public class Test3 {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("2 이상의 정수를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i =2; i<=res; i++) {
			if(i == res) {
				System.out.println( res + "은 소수입니다.");
			} else if( res % i == 0) {
				System.out.println( res + "은 소수가 아닙니다.");
				break;
			}
		}
		

	}

}
