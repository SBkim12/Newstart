import java.util.Scanner;

public class BJ2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[101][101];
		
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				board[i][j]=0;
			}
		}
		
		int cpaper = sc.nextInt();
		
 		int size = 0;
		
		for(int i=0; i<cpaper; i++) {
			int up = sc.nextInt();
			int left = sc.nextInt();
			
			for(int j=up; j<up+10; j++) {
				for(int e=left; e<left+10; e++) {
					if(board[j][e]==0) {
						board[j][e]=1;
						size++;
					}
				}
			}
		}
		
		System.out.println(size);
	}

}
