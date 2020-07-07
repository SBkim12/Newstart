import java.util.Scanner;

public class BJ15921 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int prac = sc.nextInt();
		if(prac==0) {
			System.out.println("divide by zero");
		}else {
			double hap =0;
			double expect = 0;
			int[] record = new int[prac];
			for(int i=0; i<prac; i++) {
				record[i] = sc.nextInt();
				hap+=record[i];
				expect+=record[i]*(1/(double)prac);
			}

			double avg = hap/prac;
			
			System.out.printf("%.2f",avg/expect);
		}
	}

}
