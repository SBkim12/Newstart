import java.util.Scanner;

public class BJ1225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ab = sc.nextLine();
		
		String[] num = ab.split(" ");
		
		String a = num[0];
		String b = num[1];
		
		String[] A = a.split("");
		String[] B = b.split("");
		
		int ans =0;
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B.length; j++) {
				ans+=Integer.parseInt(A[i])*Integer.parseInt(B[j]);
			}
		}
		
		
		
		System.out.println(ans);
		
	}

}
