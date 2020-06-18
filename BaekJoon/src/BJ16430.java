import java.util.Scanner;

public class BJ16430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int c = B-A;
		
		int i=2;
		while(i<=c) {
			if(c%i==0 && B%i==0) {
				c/=i;
				B/=i;
				
			}
			i++;
		}
		
		System.out.printf("%d %d", c ,B);
	}

}
