import java.util.*;

public class BJ2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String pass = sc.nextLine();

		for(int i=0; i<n; i++) {
			String S = sc.nextLine();
			String[] A= S.split(" ");
			int a=Integer.parseInt(A[0]);
			String[] ans =  A[1].split("");
			for(int j=0; j<ans.length; j++) {
				for(int e=0; e<a; e++) {
					System.out.print(ans[j]);
				}
			}
		}

	}

}
