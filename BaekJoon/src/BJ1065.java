import java.util.Scanner;

public class BJ1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(num(n));

	}
	public static int num(int a) {
		int ans = 0;
		if(a<100) {
			return a;
		}
		else {
			for(int i=111; i<=a; i++) {
				int h = i/100;
				int t = (i%100)/10;
				int o = i%10;
				if(h-t==t-o) {
					ans++;
				}
			}
		}
		return (99+ans);
	}

}
