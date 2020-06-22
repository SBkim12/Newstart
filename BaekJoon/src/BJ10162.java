import java.util.Scanner;

public class BJ10162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int a = 300;
		int b = 60;
		int c = 10;
		
		int ansa = 0;
		int ansb = 0;
		int ansc = 0;
		
		ansa+=t/a;
		t=t%a;
		ansb+=t/b;
		t=t%b;
		ansc+=t/c;
		t=t%c;
		if(t>0) {
			System.out.println(-1);
		}else {
		System.out.printf("%d %d %d",ansa, ansb, ansc);
		}
	}

}
