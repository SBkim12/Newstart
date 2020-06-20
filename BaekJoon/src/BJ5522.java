import java.util.Scanner;

public class BJ5522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		int ans =0;
		
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
			
			ans+=num[i];
		}
		
		System.out.println(ans);
	}

}
