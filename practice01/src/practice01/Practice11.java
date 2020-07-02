package practice01;
import java.io.*;
public class Practice11 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("몇 번째 처리를 건너 뛰시겠습니까?(1~10)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=10; i ++) {
			if(i ==res)
				//continue는 반복처리를 건너 뛴 다음, 다음 작업을 진행한다.
				continue;
			System.out.println(i + "번째 처리입니다.");
		}

	}

}
