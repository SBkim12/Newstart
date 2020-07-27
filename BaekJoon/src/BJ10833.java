import java.util.Scanner;

public class BJ10833 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int school = sc.nextInt();
		
		int ans = 0;
		
		int student;
		int apple;
		for(int i=0; i<school; i++) {
			student = sc.nextInt();
			apple = sc.nextInt();
			
			ans+=apple%student;
		}
		System.out.println(ans);
	}

}
