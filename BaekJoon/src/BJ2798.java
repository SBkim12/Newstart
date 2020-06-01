import java.util.*;

public class BJ2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String range = sc.nextLine();
		String[] r = range.split(" ");
		
		int num = Integer.parseInt(r[0]);
		int max = Integer.parseInt(r[1]);
		
		String nums = sc.nextLine();
		
		String[] next = nums.split(" ");
		
		int ans=0;
		int high =0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				for(int e=0; e<num; e++) {
					int hap=0;
					if(Integer.parseInt(next[j])!=Integer.parseInt(next[i]) && Integer.parseInt(next[e])!=Integer.parseInt(next[i]) && Integer.parseInt(next[e])!=Integer.parseInt(next[j])) {
						hap=Integer.parseInt(next[i])+Integer.parseInt(next[j])+Integer.parseInt(next[e]);
						if(hap<=max) {
							high=high>hap?high:hap;
						}
					}
				}
			}
		}
		System.out.print(high);

	}

}
