import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class BJ11651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		int[][] xy = new int[test][2];
		for(int i=0; i<test; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		Arrays.sort(xy, new Comparator<int[]>(){
			@Override
			public int compare(int[] x, int[] y) {
				if(x[1] == y[1]) {
					return Integer.compare(x[0], y[0]);
				}
				return Integer.compare(x[1], y[1]);
			}
		});
		
		for(int i=0; i<test; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}

}
