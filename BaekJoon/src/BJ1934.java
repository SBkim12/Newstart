import java.util.Scanner;

public class BJ1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		int[] a = new int[test];
		int[] b = new int[test];
		int[] ans = new int[test];
		for(int i=0; i<test; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();

			if(a[i]> b[i]){
				int j=2;
				int m= a[i];
				while(b[i]>=j) {
					if(b[i]%j==0 && m%j==0) {
						b[i]/=j; m/=j;
					}else {
						j++;
					}
				}
				ans[i]=a[i]*b[i];
			}else if(a[i]==b[i]) {
				ans[i]=a[i];
			}else {
				int j=2;
				int m = b[i];
				while(a[i]>=j) {
					if(a[i]%j==0 && m%j==0) {
						a[i]/=j; m/=j;
					}else {
						j++;
					}
				}
				ans[i]=a[i]*b[i];
			}

		}
		for(int i=0; i<test; i++) {
			System.out.println(ans[i]);
		}
	}

}
