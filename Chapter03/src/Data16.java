import java.util.Scanner;

public class Data16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		float b;
		
		System.out.print("ù��° ���� �Է� : ");
		a = s.nextInt();
		
		System.out.print("�ι�° �Ǽ� �Է� : ");
		b = s.nextFloat();
		
		System.out.printf("%d + %3.1f = %4.1f \n", a, b, a+b);
		System.out.printf("%d / %3.1f = %1.0f", a, b, Math.floor(a/b));
	}
}