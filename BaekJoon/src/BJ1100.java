import java.util.Scanner;

public class BJ1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans =0;
		for(int i=0; i<8; i++) {
			char[] ches = sc.nextLine().toCharArray();
			if(i%2==0) {
				for(int j=0; j<8; j++) {
					if(ches[j]=='F' && j%2==0) {
						ans++;
					}
				}
			}else {
				for(int j=0; j<8; j++) {
					if(ches[j]=='F' && j%2!=0) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
