import java.util.Scanner;

public class BJ10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		String[] ans = new String[test];
		String pass = sc.nextLine();
		for(int i=0; i<test; i++) {
			String M = sc.nextLine();
			ans[i]="";
			String[] d = M.split(" ");

			double a = Double.parseDouble(d[0]);
			int b = Integer.parseInt(d[1]);
			int c = Integer.parseInt(d[2]);
			if(b>=10) {
				if(c%a==0) {
					ans[i]+=String.valueOf((int)a);
					if(Math.ceil(c/a)<10) {
						ans[i]+="0";
					}
					ans[i]+=String.valueOf((int)Math.ceil(c/a));
				}
				else {
					ans[i]+=String.valueOf((int)(c%a));
					if(Math.ceil(c/a)<10) {
						ans[i]+="0";
					}
					ans[i]+=String.valueOf((int)Math.ceil(c/a));
				}
			}else {
				if(c%a==0) {
					ans[i]+=String.valueOf((int)a);
					if(Math.ceil(c/a)<10) {
						ans[i]+="0";
					}
					ans[i]+=String.valueOf((int)Math.ceil(c/a));
				}
				else {
					ans[i]+=String.valueOf((int)(c%a));
					if(Math.ceil(c/a)<10) {
						ans[i]+="0";
					}
					ans[i]+=String.valueOf((int)Math.ceil(c/a));
				}
			}
		}
		for(int i=0; i<test; i++) {
			System.out.println(ans[i]);
		}
	}

}
