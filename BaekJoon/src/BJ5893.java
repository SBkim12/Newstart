import java.util.Scanner;

public class BJ5893 {

	public static void main(String[] args) {
		//��Ÿ�� ����
		Scanner sc = new Scanner(System.in);
		
		String two = sc.nextLine();
		
		int num = Integer.valueOf(two,2);
		
		num*=17;
		
		two = Integer.toBinaryString(num);
		
		System.out.println(two);
	}

}
