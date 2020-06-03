import java.util.Scanner;

public class BJ1057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int round=1;
		while(true) {
			if(Math.abs(a-b)==1 && a/2!=b/2) {
				System.out.println(round);
				break;
			}
			if(a%2==1) {
				a+=1;
			}
			if(b%2==1) {
				b+=1;
			}
			a/=2;
			b/=2;
			
			round++;
		}

	}

}
