import java.util.Scanner;

public class BJ16486 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double ans = 2*a + 2*b*3.141592;
		
		System.out.println(ans);
	}

}
