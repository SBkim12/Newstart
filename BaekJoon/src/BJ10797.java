import java.util.Scanner;

public class BJ10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int date = sc.nextInt();
		
		date = date%10;
		
		int ans =0;
		for(int i=0; i<5; i++) {
			int num =sc.nextInt();
			
			if(num==date) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}

}
