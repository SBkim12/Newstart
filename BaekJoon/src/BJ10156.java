import java.util.Scanner;

public class BJ10156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int snack = sc.nextInt();
		int num = sc.nextInt();
		int money = sc.nextInt();
		
		int ans = snack*num-money;
		
		if(ans>0) {
			System.out.println(ans);
		}else {
			System.out.println(0);
		}
	}

}
