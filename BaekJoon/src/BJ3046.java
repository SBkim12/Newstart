import java.util.Scanner;

public class BJ3046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int avg = sc.nextInt();
		
		int ans = 2*avg-a;
		
		System.out.println(ans);
	}

}
