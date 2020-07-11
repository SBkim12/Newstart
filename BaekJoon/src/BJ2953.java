import java.util.Scanner;

public class BJ2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int max =0;
		int maxnum =0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				score[i]+=sc.nextInt();
			}
			if(score[i]>max) {
				max=score[i];
				maxnum=i+1;
			}
		}
		
		System.out.printf("%d %d",maxnum,max);
		
		
		
	}

}
