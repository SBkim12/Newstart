import java.util.Scanner;

public class BJ15964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		
		long b = sc.nextLong();
		
		System.out.println(sumul(a,b));
	}
	static long sumul(long a, long b) {
		long ans = (a+b)*(a-b);
		return ans;
	}

}
