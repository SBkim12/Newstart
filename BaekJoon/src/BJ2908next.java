import java.util.Scanner;

public class BJ2908next {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int reva =0;
		int revb =0;
		
		reva+=a/100;
		reva+=a%100-a%10;
		reva+=a%10*100;

		revb+=b/100;
		revb+=b%100-b%10;
		revb+=b%10*100;
		
		if(reva>revb) {
			System.out.println(reva);
		}else {
			System.out.println(revb);
		}

	}

}
