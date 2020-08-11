import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BJ2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[7];
		for(int i=0; i<7; i++) {
			num[i]=sc.nextInt();
		}

		Arrays.sort(num);

		int a=1;
		int min =0;
		int ans =0;
		for(int i=0; i<7; i++) {
			if(num[i]%2!=0) {
				if(a==1) {
					min=num[i];
				}
				ans+=num[i];
				a++;
			}
		}
		if(ans==0) {
			System.out.println(-1);
		}else {
			System.out.printf("%d\n%d",ans,min);
		}
	}

}
