import java.util.*;

public class BJ1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String enter = sc.nextLine();
		
		String[] num = enter.split(" ");
		
		int start =Integer.parseInt(num[0]);
		int last =Integer.parseInt(num[1]);
		
		
		for(int i=start; i<=last; i++) {
			int sosu=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					sosu++;
				}
			}
			if(sosu==2) {
				System.out.println(i);
			}
		}

		
	}

}
