import java.util.Arrays;
import java.util.Scanner;

public class BJ11948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] test = new int[4];
		for(int i=0; i<4; i++) {
			test[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Arrays.sort(test);
		
		int hap = test[1]+test[2]+test[3];
		
		if(a>b) {
			hap+=a;
		}else {
			hap+=b;
		}
		
		System.out.println(hap);
	}

}
