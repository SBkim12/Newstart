import java.util.Scanner;

public class BJ2914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = a*(b-1)+1;
		System.out.println(ans);
	}

}
