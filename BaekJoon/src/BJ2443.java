import java.util.Scanner;

public class BJ2443 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mid = sc.nextInt();
		
		for(int i=mid; i>0; i--) {
			for(int j=i; j<mid; j++) {
				System.out.print(" ");
			}
			for(int e=0; e<i; e++) {
				System.out.print("*");
			}
			for(int c=0; c<i-1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
