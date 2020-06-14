import java.util.Scanner;

public class BJ10991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		
		for(int i=0; i<star; i++) {
			for(int j=star-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int e=0; e<(i+1)*2; e++) {
				if(e%2==0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
