import java.util.Scanner;

public class BJ17496 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int summer = sc.nextInt();
		int t = sc.nextInt();
		int pot = sc.nextInt();
		int price = sc.nextInt();
		
		int a = (summer-1)/t;
		int ans = a*pot*price;
		System.out.println(ans);
	}

}
