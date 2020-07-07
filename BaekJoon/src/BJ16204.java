import java.util.Scanner;

public class BJ16204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int card = sc.nextInt();
		int o = sc.nextInt();
		int io = sc.nextInt();
		
		int x= card-o;
		int ix = card-io;
		
		int max=0;
		if(o<io) {
			max+=o;
		}else {
			max+=io;
		}
		if(x<ix) {
			max+=x;
		}else {
			max+=ix;
		}
		
		System.out.println(max);
	}

}
