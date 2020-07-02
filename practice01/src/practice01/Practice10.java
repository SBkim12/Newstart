package practice01;
import java.io.*;
public class Practice10 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("정수를 입력하십시오. (1~5)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
		case 1:
		case 2:
			System.out.println("조금만 더 노력합시다.");
			//break는 처리의 흐름을 강제로 종료시키고, 그 블록에서 빠져 나감
			break;
		case 3:
		case 4:
			System.out.println("이 페이스로 더 노력합시다.");
			break;
		case 5:
			System.out.println("매우 우수합니다.");
			break;
		default:
			System.out.println("1~5까지의 성적을 입력하십시오.");
			break;
		}

	}

}
