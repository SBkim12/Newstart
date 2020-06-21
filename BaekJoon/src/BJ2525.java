import java.util.Scanner;

public class BJ2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		int cook = sc.nextInt();
		
		hour+=cook/3600;
		
		cook%=3600;
		
		min+=cook/60;
		
		cook%=60;
		
		sec+=cook;
		
		while(sec>=60) {
			min++;
			sec-=60;
		}
		
		while(min>=60) {
			hour++;
			min-=60;
		}
		
		while(hour>=24) {
			hour-=24;
		}
		
		System.out.printf("%d %d %d", hour, min, sec);
	}

}
