import java.util.Scanner;

public class BJ11659 {

	public static void main(String[] args) {
		//시간초과
		Scanner sc = new Scanner(System.in);
		
		int nums = sc.nextInt();
		
		int test = sc.nextInt();
		
		int[] num = new int[nums];
		
		for(int i=0; i<nums; i++) {
			num[i] = sc.nextInt();
		}
		
		int[] ans = new int[test];
		for(int i=0; i<test; i++) {
			int start =sc.nextInt();
			int end = sc.nextInt();
			
			ans[i]=0;
			for(int j=start-1; j<end; j++) {
				ans[i]+=num[j];
			}
		}
		
		for(int i=0; i<test; i++) {
			System.out.println(ans[i]);
		}
	}

}
