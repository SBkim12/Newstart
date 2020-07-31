import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BJ9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		String pass = sc.nextLine();
		int[] num = new int[test];
		
		ArrayList<String> rList = new ArrayList<>();
		for(int i=0; i<test; i++) {
			String word = sc.nextLine();
			
			String[] words = word.split("");
			
			int right = 0;
			int left =0;
			
			for(int j=0; j<words.length; j++) {
				if(words[j].equals(")")){
					left++;
					if(right<left) {
						rList.add("NO");
						break;
					}
				}else if(words[j].equals("(")) {
					right++;
				}
			}
			
			if(right==left) {
				rList.add("YES");
			}else if(right>left) {
				rList.add("NO");
			}
			
		}
		
		Iterator<String> it = rList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
