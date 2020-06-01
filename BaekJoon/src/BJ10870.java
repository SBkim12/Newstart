import java.util.Scanner;

public class BJ10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(fibo(num));


	}
	public static int fibo(int n) {
		if(n<=1)
			return n;
		else {
			return fibo(n-2)+fibo(n-1);
		}
	}
}
