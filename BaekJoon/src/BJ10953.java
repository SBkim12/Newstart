import java.util.Scanner;

public class BJ10953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		String pass = sc.nextLine();
		int[] a = new int[test];
		int[] b = new int[test];
		for(int i=0; i<test; i++) {
			String word = sc.nextLine();
			String[] words = word.split(",");
			a[i] = Integer.parseInt(words[0]);
			b[i] = Integer.parseInt(words[1]);
		}
		
		for(int i=0; i<test; i++) {
			System.out.printf("%d\n",a[i]+b[i]);
		}
	}

}
