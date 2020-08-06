import java.util.Arrays;
import java.util.Scanner;

public class BJ2965 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] kang = new int[3];
		for(int i=0; i<3; i++) {
			kang[i]=sc.nextInt();
		}
		
		Arrays.sort(kang);
		
		if(kang[1]-kang[0] < kang[2]-kang[1]) {
			System.out.println(kang[2]-kang[1]-1);
		}else {
			System.out.println(kang[1]-kang[0]-1);
		}
	}

}
