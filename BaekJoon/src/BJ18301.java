import java.util.Scanner;

public class BJ18301 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		double b = sc.nextDouble();
		
		int c = sc.nextInt();
		
		System.out.println((int)Math.floor((a+1)*(b+1)/(c+1)-1));
	}

}
