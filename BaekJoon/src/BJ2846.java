import java.util.Scanner;

public class BJ2846 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int road = sc.nextInt();
		
		int[] up = new int[road];
		int[] ups = new int[road-1];
		
		up[0] = sc.nextInt();
		for(int i=1; i<road; i++) {
			up[i]=sc.nextInt();
			
			if(up[i]>up[i-1]) {
				ups[i-1]=up[i]-up[i-1];
				
			}else {
				ups[i-1]=0;
			}
		}
		
		int max =ups[0];
		for(int i=1; i<road-1; i++) {
			if(ups[i-1]>0 && ups[i]>0) {
				ups[i]+=ups[i-1];
			}
			
			if(ups[i]>max) {
				max=ups[i];
			}

		}
		System.out.println(max);
		
	}

}
