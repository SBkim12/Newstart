import java.util.Scanner;

public class BJ2556 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
