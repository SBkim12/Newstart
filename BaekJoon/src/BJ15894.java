import java.math.BigInteger;
import java.util.Scanner;

public class BJ15894 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n =sc.nextLine();
		
		BigInteger num = new BigInteger(n);
		BigInteger four = new BigInteger("4");
		System.out.println(num.multiply(four));
	}

}
