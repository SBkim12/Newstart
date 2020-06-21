import java.util.Scanner;

public class BJ2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[8];
		for(int i=0; i<8; i++) {
			num[i] = sc.nextInt();
		}
		int max = 0;
		int now = 0;
		for(int i=0; i<8; i+=2) {
			now-=num[i];
			now+=num[i+1];
			if(now>max) {
				max=now;
			}
		}
		System.out.println(max);
		
	}

}
