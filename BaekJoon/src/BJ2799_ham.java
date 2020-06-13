import java.util.*;

public class BJ2799_ham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		
		String range = sc.nextLine();
		String[] r = range.split(" ");
		int[] ans = new int[3];
		int num = Integer.parseInt(r[0]);
		int max = Integer.parseInt(r[1]);
		int[] bob = new int[num];
		for(int i=0; i<max/2; i++) {
			a.add(i+1);
		}
		
		Collections.shuffle(a);
		
		for(int i=0; i<num; i++) {
			a.get(i);
			bob[i]=a.get(i);
			System.out.print(bob[i]+ " ");
		}
		System.out.println();
		
		

		int high =0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				for(int e=0; e<num; e++) {
					int hap=0;
					if(bob[j]!=bob[i] && bob[e]!=bob[i] && bob[e]!=bob[j]) {
						hap=bob[i]+bob[j]+bob[e];
						if(hap<=max) {
							if(hap>high) {
								ans[0]=bob[i];
								ans[1]=bob[j];
								ans[2]=bob[e];
							}
							high=high>hap?high:hap;
						}
					}
				}
			}
		}
		System.out.println(high);
		System.out.printf("%d %d %d", ans[0], ans[1], ans[2]);

	}

}
