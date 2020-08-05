import java.util.Arrays;
import java.util.Scanner;

public class BJ1205 {

	public static void main(String[] args) {
		//런타임 에러
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		
		int score = sc.nextInt();
		
		int scoreList = sc.nextInt();
		
		int[] scores = new int[scoreList];

		int[] baseScore1 = new int[base+1];
		int[] baseScore2 = new int[base+1];
		
		baseScore1[0]=score;
		
		for(int i=1; i<base+1; i++) {
			baseScore1[i]=sc.nextInt();
		}
		
		Arrays.sort(baseScore1);
		
		for(int i=0; i<base+1; i++) {
			baseScore2[i]=baseScore1[base-i];
		}
		
		int size=0;
		if(scoreList>base+1) {
			size = base+1;
		}else {
			size = scoreList; 
		}
		
		int[] rank = new int[scoreList];
		
		int ans = -1;
		
		
		for(int i=0; i<size; i++) {
			scores[i]=baseScore2[i];
			
			rank[i]=i+1;
			
			if(i>0) {
				if(scores[i]==scores[i-1]) {
					rank[i]=rank[i-1];
				}
			}
			
			
			if(scores[i]<=score) {
				ans=rank[i];
				if(i==size-1 && baseScore2[i+1]==score) {
					ans=-1;
				}
			}
		}
		
		System.out.println(ans);
	}

}
