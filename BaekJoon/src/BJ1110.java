import java.util.Scanner;

public class BJ1110{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a=0;
		int b=0;
		int cnt = 0;
		if(num<10) {
			num*=10;
		}
		int n;
		
		a=num/10;
		b=num%10;
		while(true) {
			cnt++;
			n=b;
			b=(a+b)%10;
			a=n;
			if(a*10+b==num) {
				System.out.print(cnt);
				break;
			}
		}
	}
}