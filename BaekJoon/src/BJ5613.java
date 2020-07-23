import java.util.Scanner;

public class BJ5613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans =sc.nextInt();
		String pass = sc.nextLine();
		int num;
		while(true) {
			char s = sc.nextLine().charAt(0);
			switch(s) {
			case '+':
				num =sc.nextInt();
				ans+=num;
				break;
			case '-':
				num =sc.nextInt();
				ans-=num;
				break;
			case '*':
				num =sc.nextInt();
				ans*=num;
				break;
			case '/':
				num =sc.nextInt();
				ans/=num;
				break;
			case '=':
				System.out.print(ans);
				break;
			}
			if(s=='=') {
				break;
			}
			pass = sc.nextLine();
		}
	}

}
