import java.util.Scanner;

public class BJ5565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int price;
		for(int i=0; i<9; i++) {
			price = sc.nextInt();
			
			max-=price;
		}
		
		System.out.println(max);
	}

}
