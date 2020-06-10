import java.util.Scanner;

public class bJ2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] fib = new int[46];
		
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2; i<=num; i++) {
			fib[i] = fib[i-2] + fib[i-1];
		}
		System.out.println(fib[num]);
	}
}
