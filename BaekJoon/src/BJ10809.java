import java.util.*;

public class BJ10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] word = sc.nextLine().toCharArray();
		
		for(int i=97; i<123; i++) {
			int no=0;
			for(int j = 0; j<word.length; j++) {
			if((char)i==word[j]) {
				System.out.print(j+" ");
				no++;
				break;
			}
			}
			
			if(no==0) {
				System.out.print(-1+" ");
			}
		}
	}

}
