import java.util.Scanner;

public class BJ3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] piece = {1,1,2,2,2,8};
		
		int[] now = new int[6];
		
		for(int i=0; i<6; i++) {
			now[i] = sc.nextInt();
			
			piece[i]-=now[i];
			
			System.out.printf("%d ", piece[i]);
		}
	}

}
