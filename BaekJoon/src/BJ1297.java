import java.util.Scanner;

public class BJ1297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double daegak = sc.nextDouble();
		double heightr = sc.nextDouble();
		double widthr = sc.nextDouble();
		
		double a = Math.sqrt(Math.pow(daegak,2)/(Math.pow(heightr,2)+Math.pow(widthr,2)));
		System.out.printf("%d %d",(int)Math.floor(a*heightr), (int)Math.floor(a*widthr));
	}

}
