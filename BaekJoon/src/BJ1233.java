import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ1233 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		List<Integer> hap = new ArrayList<>();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				for(int e=1; e<=c; e++) {
					hap.add(i+j+e);
				}
			}
		}
		
		int[] haps = new int[81];
		
		for(int i=0; i<81; i++) {
			haps[i] = 0;
		}
		int max =0;
		for(int i=0; i<hap.size(); i++) {
			haps[hap.get(i)]++;
			if(haps[hap.get(i)]>max) {
				max=haps[hap.get(i)];
			}
		}
		for(int i=3; i<hap.size(); i++) {
			if(haps[i]==max) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
