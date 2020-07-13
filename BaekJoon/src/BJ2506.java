import java.util.Scanner;

public class BJ2506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int question = sc.nextInt();
		
		int[] score = new int[question];
		score[0] = sc.nextInt();
		int ans = score[0];
		for(int i=1; i<question; i++) {
			score[i]=sc.nextInt();
			if(score[i-1]>=1 && score[i]==1) {
				score[i]=score[i-1]+1;
				ans+=score[i];
			}else {
				ans+=score[i];
			}
		}
		System.out.println(ans);
	}

}
