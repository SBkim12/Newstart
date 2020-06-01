import java.util.*;

public class BJ17817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String pass = sc.nextLine();

		String sosu = sc.nextLine();

		String[] s = sosu.split(" ");
		int ans=0;
		for(int i=0; i<num; i++) {
			int ss=0;
			for(int j=1; j<=Integer.parseInt(s[i]); j++) {
				if(Integer.parseInt(s[i])%j==0) {
					ss++;
				}
				}
			if(ss==2) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
