import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BJ3058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		List<Integer> com = new ArrayList<>();
		int[] num = new int[7];
		
		int[] ans = new int[test];
		int[] answer = new int[test];
		for(int i=0; i<test; i++) {
			answer[i]=0;
			int a =0;
			for(int j=0; j<7; j++) {
				num[j] = sc.nextInt();
				
				if(num[j]%2==0) {
					answer[i]+=num[j];
					com.add(num[j]);
				}
			}
			Collections.sort(com);
			ans[i]=com.get(0);
			com.clear();
		}
		for(int i=0; i<test; i++) {
			System.out.println(answer[i]+" "+ans[i]);
		}
	}

}
