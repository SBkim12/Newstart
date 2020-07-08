import java.util.Scanner;

public class BJ2163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int col = sc.nextInt();
		int row = sc.nextInt();
		
		int ans = (col-1)+col*(row-1);
		
		System.out.println(ans);
	}

}
