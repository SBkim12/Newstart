import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
//뭐가 틀린거지...
public class BJ1257 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mon = sc.nextLine();
		BigInteger money = new BigInteger(mon);
	
		int kinds = sc.nextInt();
		
		BigInteger ans = new BigInteger("0");
		int[] coin = new int[kinds];
		for(int i=0; i<kinds; i++) {
			coin[i] =sc.nextInt();
		}
		Arrays.sort(coin);
		for(int i=kinds-1; i>=0; i--) {
			BigInteger a = new BigInteger(String.valueOf(coin[i]));
			ans=ans.add(money.divide(a));
			money=money.remainder(a);
		}
		
		System.out.println(ans);
	}

}
