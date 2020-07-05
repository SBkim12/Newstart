import java.util.Scanner;

public class BJ1236 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		int more =0;
		char[][] castle = new char[row+1][col+1];
		String pass =sc.nextLine();
		for(int i=0; i<row; i++) {
			String line = sc.nextLine();
			for(int j=0; j<col; j++) {
				castle[i][j]=line.charAt(j);
			}
		}
		//모든행과 모든열에 한명이상의 경비원 최소의 인원..
		for(int i=0; i<row; i++) {
			for(int j=0; i<col; j++) {
				int have=0;
				if(castle[i][j]=='.') {
					
					
				}
			}
		}
		System.out.printf("%d", more);
		
	}

}
