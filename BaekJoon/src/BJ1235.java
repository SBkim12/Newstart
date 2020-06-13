import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 마지막 99%에서 실패함 무엇이 문제일까?
public class BJ1235 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int stu = sc.nextInt();

		String pass = sc.nextLine();
		String[] stnum = new String[stu];
		for(int i=0; i<stu; i++) {
			stnum[i] = sc.nextLine();
		}

		System.out.println(ans(stnum));

	}
	public static int ans(String[] s) {
		List<String> com = new ArrayList<>();
		int x;
		for(x=1; x<=7; x++) {

			for(String data : s) {
				if(!com.contains(data.substring(data.length()-x, data.length()))) {
					com.add(data.substring(data.length()-x, data.length()));
				}
			}
			if(com.size()==s.length) {
				break;
			}
			com.clear();
		}
		return x;
	}
}
