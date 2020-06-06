import java.util.*;

public class BJ2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		String pass = sc.nextLine();
		String[] testcase = new String[test];
		
		for(int i=0; i<test; i++) {
			testcase[i] = sc.nextLine();
		}
		
		for(int i=0; i<test; i++) {
			String[] a= testcase[i].split(" ");
			int iterate = Integer.parseInt(a[0]);
			String word = a[1];
			String[] words = word.split("");
			for(int j=0; j<words.length; j++) {
				for(int e=0; e<iterate; e++) {
					System.out.print(words[j]);
				}
			}
			System.out.println();
		}

	}

}
