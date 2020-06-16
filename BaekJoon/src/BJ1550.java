import java.util.Scanner;

public class BJ1550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		int ans = Integer.valueOf(num, 16);
		
		System.out.println(ans);
	}

}
