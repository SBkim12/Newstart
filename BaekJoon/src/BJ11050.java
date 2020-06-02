import java.util.Scanner;

public class BJ11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int top=1;
		for(int i=1; i<=N; i++) {
			top*=i;
		}
		int low=1;
		for(int i=1; i<=K; i++) {
			low*=i;
		}
		int lows=1;
		for(int i=1; i<=N-K; i++) {
			lows*=i;
		}
		System.out.println(top/(low*lows));

	}

}
