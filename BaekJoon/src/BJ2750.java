import java.util.Arrays;
import java.util.Scanner;

public class BJ2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		int[] num = new int[test];
		for(int i=0; i<test; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
