import java.util.Scanner;

public class BJ2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int ans;

		if(dice1==dice2 && dice2==dice3 && dice1==dice3) {
			ans = 10000+dice1*1000;
		}else if(dice1==dice2 || dice2==dice3){
			ans=1000+dice2*100;
		}else if(dice1==dice3) {
			ans=1000+dice1*100;
		}else {
			int max =0;
			max=max>dice1?max:dice1;
			max=max>dice2?max:dice2;
			max=max>dice3?max:dice3;
			ans=max*100;
		}
		
		System.out.println(ans);
	}

}
