import java.util.Scanner;

public class BJ10992 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		int n =1;
		for(int i=0; i<star; i++) {
			if(i==0) {
				for(int j=1; j<star; j++) {
				System.out.print(" ");
				}
				System.out.println("*");
			}else if(i==star-1) {
				for(int j=0; j<star*2-1; j++) {
				System.out.print("*");
				}
			}else {
				for(int j=star; j>i+1; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<n; j++) {
					System.out.print(" ");
				}
				n+=2;
				System.out.println("*");
				
			}
		}
	}

}
