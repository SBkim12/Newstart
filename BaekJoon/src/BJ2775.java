import java.util.Scanner;

public class BJ2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();


		for(int i=0; i<test; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();

			int[][] room = new int[a+1][b];

			for(int j=0; j<=a; j++) {
				for(int e=0; e<b; e++) {
					if(j==0) {
						room[j][e]=e+1;
					}else {
						for(int c=0; c<=e; c++) {
							room[j][e]+=room[j-1][c];
						}
					}
				}
			}
			System.out.println(room[a][b-1]);
		}

	}

}
