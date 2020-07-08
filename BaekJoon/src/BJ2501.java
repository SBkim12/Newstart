import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt();
		int k = sc.nextInt();

		List<Integer> rList = new ArrayList<>();

		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				rList.add(i);
			}
		}
		if(k<=rList.size()) {
			System.out.println(rList.get(k-1));
		}else {
			System.out.println(0);
		}
	}

}
