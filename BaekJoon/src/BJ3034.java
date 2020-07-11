import java.util.Scanner;

public class BJ3034 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int matchs = sc.nextInt();
		int col = sc.nextInt();
		int row = sc.nextInt();

		int[] match = new int[matchs];
		for(int i=0; i<matchs; i++) {
			match[i]=sc.nextInt();
		}
		for(int i=0; i<matchs; i++) {
			if((col*col) + (row*row) >= (match[i]*match[i])) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}




	}
}
