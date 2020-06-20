import java.util.Scanner;

public class BJ8370 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int busi = sc.nextInt();
		int busiseats = sc.nextInt();
		int econo = sc.nextInt();
		int econoseats = sc.nextInt();
		
		int ans = busi*busiseats + econo*econoseats;
		
		System.out.println(ans);
	}

}
