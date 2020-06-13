import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BJ15792 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] num = sc.nextLine().split(" ");
		
		BigDecimal A = new BigDecimal(num[0]);
		BigDecimal B = new BigDecimal(num[1]);
		
		BigDecimal ans = A.divide(B,10^1000, RoundingMode.FLOOR);
		
		System.out.println(ans);
	}

}
