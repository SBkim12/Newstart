import java.util.*;

public class BJ2231 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int hap = sc.nextInt();
		int x =0;
		for(int i=0; i<hap; i++) {
			int a = i/1000000%10;
			int b = i/100000%10;
			int c = i/10000%10;
			int d = i/1000%10;
			int e = i/100%10;
			int f = i/10%10;
			int g = i%10;
			if(hap==i+a+b+c+d+e+f+g) {
				System.out.println(i);
				break;
			}else {
				x++;
			}
		}
		if(x==63) {
			System.out.println(0);
		}
		

	}

}
