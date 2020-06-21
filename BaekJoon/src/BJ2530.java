import java.util.Scanner;

public class BJ2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int cook = sc.nextInt();
		
		hour+=cook/60;
		
		min+=cook%60;
		
		if(min>=60) {
			hour++;
			min-=60;
		}
		
		if(hour>23) {
			hour-=24;
		}
		
		System.out.printf("%d %d", hour, min);
	}

}
