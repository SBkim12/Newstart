import java.util.Scanner;

public class BJ2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int square = sc.nextInt();
		
		int ans = num*square;
		
		int[] news = new int[5];
		
		for(int i=0; i<5; i++) {
			news[i] = sc.nextInt();
			
			news[i]-=ans;
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("%d ", news[i]);
		}
		
	}

}
