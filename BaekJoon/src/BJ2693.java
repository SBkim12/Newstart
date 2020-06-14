import java.util.Arrays;
import java.util.Scanner;

public class BJ2693 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int test = sc.nextInt();
		int[] ans = new int[test];
		int[] num = new int[10];
		for(int i=0; i<test; i++) {
			for(int j=0; j<10; j++) {
				num[j] = sc.nextInt();
			}
			Arrays.sort(num);
			
			ans[i] = num[7];
		}
		for(int i=0; i<test; i++) {
			System.out.println(ans[i]);
		}
	}

}
