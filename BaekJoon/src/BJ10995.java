import java.util.Scanner;

public class BJ10995 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		
		for(int i=0; i<star; i++) {
			if(i%2==0) {
				for(int j=0; j<star*2; j++) {
					if(j%2==0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}else {
				for(int j=0; j<star*2; j++) {
					if(j%2==0) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}

}
