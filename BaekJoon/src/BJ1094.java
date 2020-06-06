import java.util.Scanner;

public class BJ1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stick = 64;
		
		int X = sc.nextInt();
		int hap =64;
		int n = 1;
		while(hap!=X) {
			stick/=2;
			n++;
			if(hap-stick>=X) {
				hap-=stick;
				n--;
			}
		}
		System.out.println(n);

	}

}
