import java.util.Scanner;

public class BJ1977 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i=1;
		int ans =0;
		int count = 1;
		int ans2 = 0;
		while(Math.pow(i,2)<=b) {
			if(Math.pow(i,2)>=a) {
				ans+=(int)Math.pow(i,2);
				if(count==1) {
					ans2=ans;
					count++;
				}
			}
			i++;
		}
        if(ans==0) {
			System.out.println(-1);
		}else {
		System.out.println(ans);
		System.out.println(ans2);
        }
	}

}
