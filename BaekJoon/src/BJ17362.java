import java.util.Scanner;

public class BJ17362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int a = num/4;
		num = num%4;
		if(a%2==0) {
			switch (num){
			case 0:
				System.out.println(2);
				break;
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			}
		}else {
			switch (num){
			case 0:
				System.out.println(4);
				break;
			case 1:
				System.out.println(5);
				break;
			case 2:
				System.out.println(4);
				break;
			case 3:
				System.out.println(3);
				break;
			}
		}
	}

}
