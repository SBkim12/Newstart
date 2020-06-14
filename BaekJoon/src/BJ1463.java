import java.util.Scanner;

public class BJ1463 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int X = sc.nextInt();
		int start =0;
		System.out.println(num(X,start));
	}
	public static int num(int a, int ans) {
		while(a!=1) {
			if(a%6==0) {
				ans++;
				int b = num(a-1, ans);
				int d = num(a/3, ans);
				if(b<d) {
					return b;
				}else {
					return d;
				} 
			}else if(a%3==0) {
				if((a-1) % 2 == 0){
					ans++;
					int b = num(a-1, ans);
					int d = num(a/3, ans);
					if(b<d) {
						return b;
					}else {
						return d;
					}
				}else
				a/=3;
				ans++;
			}else if(a%2==0) {
				if((a-1)%3==0){
					ans++;
					int b = num(a-1, ans);
					int d = num(a/2, ans);
					if(b<d) {
						return b;
					}else {
						return d;
					}
				}else {
					a/=2;
					ans++;
				}
			}else {
				a--;
				ans++;
			}
		}
		return ans;
	}

}
