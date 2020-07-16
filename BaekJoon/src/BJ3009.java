import java.util.Scanner;

public class BJ3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] jum = new int[3][2];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				jum[i][j]=sc.nextInt();
			}
		}
		int x=0;
		if(jum[0][0]==jum[1][0]) {
			x=jum[2][0];
		}else if(jum[1][0]==jum[2][0]) {
			x=jum[0][0];
		}else if(jum[0][0]==jum[2][0]) {
			x=jum[1][0];
		}
		
		int y=0;
		if(jum[0][1]==jum[1][1]) {
			y=jum[2][1];
		}else if(jum[1][1]==jum[2][1]) {
			y=jum[0][1];
		}else if(jum[0][1]==jum[2][1]) {
			y=jum[1][1];
		}
		
		System.out.printf("%d %d",x,y);
	}

}
