import java.util.Scanner;

public class BJ2355 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long ans;
		if(a>b) {
			ans = (a*(a+1)-(b-1)*b)/2;
		}else {
			ans = (b*(b+1)-(a-1)*a)/2;
		}
		System.out.println(ans);
	}

}
