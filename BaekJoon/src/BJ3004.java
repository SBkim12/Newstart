import java.util.Scanner;

public class BJ3004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cut = sc.nextInt();
		
		int a, b;
		if(cut%2==0) {
			a=cut/2+1;
			b=cut/2+1;
		}else {
			a=(cut-1)/2+1;
			b=(cut-1)/2+2;
		}
		
		System.out.printf("%d", a*b);
	}

}
