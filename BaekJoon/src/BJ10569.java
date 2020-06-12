import java.util.Scanner;

public class BJ10569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		int[] ans = new int[test];
		for(int i=0; i<test; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			ans[i] = b-a+2;
		}
		for(int i=0; i<test; i++) {
			System.out.println(ans[i]);
		}
	}

}
