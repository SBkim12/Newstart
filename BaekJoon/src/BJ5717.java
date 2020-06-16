import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ5717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int man=1;
		int woman=1;
		List<Integer> fri = new ArrayList<>();
		while(true) {
		man =sc.nextInt();
		
		woman = sc.nextInt();
		if(man==0 & woman==0) {
			break;
		}
		fri.add(man + woman);
		}
		
		Iterator<Integer> it = fri.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
