import java.util.Arrays;
import java.util.Scanner;

public class BJ1037 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] n = new int[num];
		
		for(int i=0; i<num; i++) {
			n[i]=sc.nextInt();
		}
		Arrays.sort(n);
		
		int answer = n[0] * n[num-1];
		
		System.out.println(answer);
	}

}
