import java.util.Scanner;

public class Scans {

	public static void main(String[] args) {
		int a,b;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.println("A�� �Է����ּ���");
		a = s.nextInt();
		System.out.println("B�� �Է����ּ���");
		b = s.nextInt();
		
		result = a+b;
		System.out.println(a + "+" + b + "=" + result);
		

	}

}
