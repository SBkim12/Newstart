import java.util.Scanner;

public class BJ2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		
		for(int i=0; i<star; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int e=star; e>i; e--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
