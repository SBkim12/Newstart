import java.math.BigInteger;
import java.util.Scanner;

public class BJ1271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String[] b = a.split(" ");
		
		BigInteger money = new BigInteger(b[0]);
		
		BigInteger man = new BigInteger(b[1]);
		
		BigInteger answer = money.divide(man);
		BigInteger na = money.mod(man);
		
		System.out.println(answer);
		System.out.println(na);
	}

}
