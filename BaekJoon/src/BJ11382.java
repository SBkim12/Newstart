import java.math.BigInteger;
import java.util.Scanner;

public class BJ11382 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		String[] nums = num.split(" ");
		
		String a = nums[0];
		String b = nums[1];
		String c = nums[2];
		
		
		BigInteger A = new BigInteger(a);
		BigInteger B = new BigInteger(b);
		BigInteger C = new BigInteger(c);
		
		System.out.println(A.add(B).add(C));
	}

}
