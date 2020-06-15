import java.util.Scanner;

public class BJ10886 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int test = sc.nextInt();
		
		int[] man = new int[test];
		int ans =0;
		for(int i=0; i<test; i++) {
			man[i]=sc.nextInt();
			if(man[i]==1) {
				ans++;
			}
		}
		if(ans>test/2) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}
	}

}
