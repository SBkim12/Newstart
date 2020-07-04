import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ5101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> rList = new ArrayList<>();
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==0 && b==0 && c==0) {
				break;
			}
			c=c-a;
			if(c%b==0) {
				rList.add(c/b+1);
			}else {
				rList.add(0);
			}
			
		}
		for(int i=0; i<rList.size(); i++) {
			if(rList.get(i)==0) {
				System.out.println("X");
			}else {
				System.out.println(rList.get(i));
			}
		}
	}

}
