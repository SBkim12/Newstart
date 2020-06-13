import java.math.BigInteger;
import java.util.Scanner;

public class BJ1225_another {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ab = sc.nextLine();
		
		String[] num = ab.split(" ");
		
		String a = num[0];
		String b = num[1];
		
		String[] A = a.split("");
		String[] B = b.split("");
		
		BigInteger As = new BigInteger("0");
		
		for(int i=0; i<A.length; i++) {
			As=As.add(new BigInteger(A[i]));
		}
		BigInteger Bs = new BigInteger("0");
		for(int j=0; j<B.length; j++) {
			Bs =Bs.add(new BigInteger(B[j]));
		}
		BigInteger ans  = As.multiply(Bs);
		System.out.println(ans);
		
	}

}
