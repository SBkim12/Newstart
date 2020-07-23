import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ4880 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> answer = new ArrayList<>();
		List<String> name = new ArrayList<>();
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) {
				break;
			}
			
			if(b-a == c-b) {
				name.add("AP");
				answer.add(c+(b-a));
			}else {
				name.add("GP");
				answer.add(c*(b/a));
			}
		}
		
		Iterator<String> it = name.iterator();
		Iterator<Integer> its = answer.iterator();
		
		while(it.hasNext()) {
			System.out.printf("%s %d\n", it.next(), its.next());
		}
	}

}
