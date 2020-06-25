import java.util.Scanner;

public class BJ15873 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a;
		int b = num%10;
		if(b==0) {
			b=10;
			a=num/100;
		}else {
			a = num/10;
		}
		System.out.println(a+b);
	}

}
