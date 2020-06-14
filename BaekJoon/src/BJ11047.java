import java.util.Scanner;

public class BJ11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int coin = sc.nextInt();
		
		int money = sc.nextInt();
		
		int[] coins = new int[coin];
		for(int i=0; i<coin; i++) {
			coins[i] = sc.nextInt();
		}
		int ans =0;
		for(int i=coin-1; i>=0; i--) {
			if(money/coins[i]>=1) {
				ans+=money/coins[i];
				money=money%coins[i];
			}
			if(money==0) {
				break;
			}
		}
		System.out.println(ans);
	}

}
