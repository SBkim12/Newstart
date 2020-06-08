import java.util.Scanner;

public class BJ1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long page = sc.nextInt();
		
		long[] num = new long[10];
		for(int i=0; i<num.length; i++) {
			num[i]=0;
		}
		for(int i=1; i<=page; i++) {
			String nums = String.valueOf(i);
			char[] numss = nums.toCharArray();
			for(int j=0; j<numss.length; j++) {
				for(int e=48; e<num.length+48; e++) {
					if((int)numss[j]==e) {
						num[e-48]++;
						break;
					}
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}

}
