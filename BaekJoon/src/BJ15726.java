import java.util.Scanner;

public class BJ15726 {

	public static void main(String[] args) {
		
		//¿À´ä
		Scanner sc= new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		
		double one = a*b/c;
		double two	= a/b*c;
		
		System.out.printf("%.0f",one>two?one:two);
	}

}
