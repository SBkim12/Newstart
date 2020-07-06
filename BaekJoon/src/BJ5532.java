import java.util.Scanner;

public class BJ5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int days = sc.nextInt();
		
		double lang = sc.nextDouble();
		
		double math = sc.nextDouble();
		
		double langmax = sc.nextDouble();
		
		double mathmax = sc.nextDouble();
		
		int langdays = (int)Math.ceil(lang/langmax);
		int mathdays = (int)Math.ceil(math/mathmax);
		
		int longday = Math.max(langdays, mathdays);
		System.out.println(days-longday);
	}

}
