import java.util.ArrayList;
import java.util.Scanner;

public class BJ2908 {

	public static void main(String[] args) {
		int a =0;
		int b=0;
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		String[] nums = num.split(" ");
		
		String[] c = nums[0].split("");
		String[] d = nums[1].split("");
		
		a+=Integer.parseInt(c[2])*100;
		a+=Integer.parseInt(c[1])*10;
		a+=Integer.parseInt(c[0]);
		
		b+=Integer.parseInt(c[2])*100;
		b+=Integer.parseInt(c[1])*10;
		b+=Integer.parseInt(c[0]);
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}

	}

}
