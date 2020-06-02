import java.util.Scanner;

public class BJ2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int start=2;
		int bestlow=1;
		while(true) {
			if(a%start==0 && b%start==0) {
				a=a/start;
				b=b/start;
				bestlow*=start;
			}else {
			start++;
			}
			if(start>a || start>b) {
				break;
			}
		}
		System.out.println(bestlow);
		System.out.println(bestlow*a*b);

	}

}
