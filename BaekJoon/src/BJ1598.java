import java.util.Arrays;
import java.util.Scanner;

public class BJ1598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[2];

		num[0] = sc.nextInt();
		num[1] = sc.nextInt();

		Arrays.sort(num);
		int height;
		double length = Math.ceil(num[1]/(double)4) - Math.ceil(num[0]/(double)4);
		if(num[0]%4==0 && num[1]%4!=0) {
			height = Math.abs(4-num[1]%4);
		}else if(num[1]%4==0 && num[0]%4!=0) {
			height = Math.abs(num[0]%4-4);
		}else {
			height = Math.abs(num[0]%4-num[1]%4);
		}
		System.out.println((int)(height+length));
	}

}
