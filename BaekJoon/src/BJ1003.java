import java.util.Scanner;

public class BJ1003 {
	static int[] dp = new int[41];	
	public int solution(int n) {
		if(n <= 1 || dp[n] != 0) 
			return dp[n];
		else
			return dp[n] = solution(n-1) + solution(n-2);
	}	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		dp[0] = 0;
		dp[1] = 1;
		System.out.println("го╠Б╫х╢ы");
		
		for(int i = 0; i < testCase; i++) {
			int num = scan.nextInt();
			new BJ1003().solution(num);
			
			if(num == 0)
				System.out.println(1 + " " + 0);
			else if(num == 1)
				System.out.println(0 + " " + 1);
			else
				System.out.println(dp[num-1] + " " + dp[num]);
		}
	}
}