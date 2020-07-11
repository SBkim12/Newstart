import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ4101 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<String> answer = new ArrayList<>();
		int a,b;
		while(true) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a==0 && b==0)
				break;
			if(a>b) {
				answer.add("Yes");
			}else {
				answer.add("No");
			}
		}
		
		Iterator<String> it = answer.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
