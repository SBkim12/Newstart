import java.math.BigInteger;
import java.util.Scanner;

public class BJ13277 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nums = sc.nextLine();
		
		String[] num = nums.split(" ");
		
		BigInteger a = new BigInteger(num[0]);
		BigInteger b = new BigInteger(num[1]);
		
		System.out.println(a.multiply(b));
	}

}
