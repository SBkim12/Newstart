import java.util.Scanner;

public class BJ10179 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		double[] num = new double[test];
		
		for(int i=0; i<test; i++) {
			num[i] = sc.nextDouble();
			num[i]=num[i]/10*8;
		}
		for(int i=0; i<test; i++) {
			System.out.printf("$%.2f\n",num[i]);
		}
	}

}
