import java.util.Scanner;

public class BJ2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mid = sc.nextInt();
		
		for(int i=0; i<mid; i++) {
			
			for(int j=mid-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int e=0; e<=i; e++) {
				System.out.print("*");
			}
			for(int c=0; c<i; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}