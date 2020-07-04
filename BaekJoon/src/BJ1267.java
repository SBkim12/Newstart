import java.util.Scanner;

public class BJ1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int youngs=0;
		int mins=0;
		int[] ring = new int[test];
		for(int i=0; i<test; i++) {
			ring[i] = sc.nextInt();
			youngs+=youngsik(ring[i]);
			mins+=minsik(ring[i]);
		}
		if(youngs<mins) {
			System.out.printf("Y %d",youngs);
		}else if(youngs==mins) {
			System.out.printf("Y M %d",youngs);
		}else {
			System.out.printf("M %d",mins);
		}
	}
	public static int youngsik(int a) {
		int ans = a/30*10+10;
		return ans;
	}
	public static int minsik(int a) {
		int ans = a/60*15+15;
		return ans;
	}

}
