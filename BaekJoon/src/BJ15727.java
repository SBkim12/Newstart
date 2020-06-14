import java.util.Scanner;

public class BJ15727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double dis = sc.nextDouble();
		
		double ans = Math.ceil(dis/5);
		System.out.printf("%d", (int)ans);
	}

}
