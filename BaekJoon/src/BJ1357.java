import java.util.Scanner;

public class BJ1357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int Y = sc.nextInt();
		
		int revX =0;
		int revY =0;
		
		if(X==1000) {
			revX=1;
		}else if(X>=100) {
			revX=X/100+(X/10%10*10)+(X%10*100);
		}else if(X>=10) {
			revX=X/10+(X%10*10);
		}else {
			revX=X;
		}
		
		if(Y==1000) {
			revY=1;
		}else if(Y>=100) {
			revY=Y/100+(Y/10%10*10)+(Y%10*100);
		}else if(Y>=10) {
			revY=Y/10+(Y%10*10);
		}else {
			revY=Y;
		}
		
		int ans = revX+ revY;
		
		int revAns=0;
		
		if(ans>=1000) {
			revAns=ans/1000 + (ans/100%10*10) + (ans/10%10*100) + (ans%10*1000);
		}else if(ans>=100) {
			revAns=ans/100+(ans/10%10*10)+(ans%10*100);
		}else if(ans>=10) {
			revAns=ans/10+(ans%10*10);
		}else {
			revAns=ans;
		}
		
		System.out.println(revAns);
	}

}
