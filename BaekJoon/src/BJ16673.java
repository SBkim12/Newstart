import java.util.Scanner;

public class BJ16673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		int love = sc.nextInt();
		
		int purchase = sc.nextInt();
		
		int ans = 0;
		for(int i=1; i<=year; i++) {
			ans+=(love*i)+(purchase*i*i);
		}
		System.out.println(ans);
	}

}
