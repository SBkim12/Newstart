import java.util.Scanner;

public class BJ1932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n + 1][n + 1];
		int[][] s = new int[n + 1][n + 1];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				a[i][j] = sc.nextInt();
				
				if(i == n-1) {
					s[i][j] = a[i][j];
				}
			}
		}
		
		for(int i = n-2; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				s[i][j] = Math.max(s[i+1][j], s[i+1][j+1]) + a[i][j];
			}
		}
		
		System.out.println(s[0][0]);

	}

}
