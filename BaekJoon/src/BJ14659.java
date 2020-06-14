import java.util.Scanner;

public class BJ14659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] mountain = new int[num];
		for(int i=0; i<num; i++) {
			mountain[i] = sc.nextInt();
		}
		int[] ans = new int[num];
		int max = ans[0];
		for(int i=0; i<num; i++) {
			ans[i]=0;
			for(int j=i+1; j<num; j++) {
				if(mountain[i]>mountain[j]) {
					ans[i]++;
				}else {
					break;
				}
			}
			if(ans[i]>max) {
				max = ans[i];
			}
		}
		System.out.println(max);
	}

}
