import java.math.BigInteger;
import java.util.Scanner;

public class BJ1009a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test= sc.nextInt();
		
		BigInteger[] ans = new BigInteger[test];
		BigInteger ten = new BigInteger("10");
		for(int i=0; i<test; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			BigInteger A = new BigInteger(String.valueOf(a));
			
			ans[i]=A.pow(b).remainder(ten);
			
			System.out.println(A.pow(b));

		}
		
		for(int i=0; i<test; i++) {
		System.out.println(ans[i]);
		}
	}

}
