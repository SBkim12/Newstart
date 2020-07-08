import java.util.Scanner;

public class BJ18005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnum = sc.nextInt();
		
		if(cnum%2!=0) {
			System.out.println(0);
		}else if(cnum%4==0) {
			System.out.println(2);
		}else {
			System.out.println(1);
		}
	}

}
