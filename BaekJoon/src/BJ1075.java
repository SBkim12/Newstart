import java.util.Scanner;

public class BJ1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		int F = sc.nextInt();

		N = N/100*100;
		while(true) {
			if(N%F==0) {
				break;
			}
			N++;
		}
		System.out.printf("%02d",N%100);
	}

}
