import java.util.Scanner;

public class BJ2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();

		int ans=0;
		int first=0;
		for(int i=start; i<=end; i++) {
			int ss=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					ss++;
				}
			}
			if(ss==2 && ans ==0) {
				first =i;
			}
			if(ss==2) {
				ans+=i;
			}

		}
		if(ans==0) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
			System.out.println(first);
		}
	}
}
