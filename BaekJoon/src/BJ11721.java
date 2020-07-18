import java.util.Scanner;

public class BJ11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] words = sc.nextLine().toCharArray();
		
		System.out.print(words[0]);
		for(int i=1; i<words.length; i++) {
			System.out.print(words[i]);
			if((i+1)%10==0) {
				System.out.println();
			}
		}
	}

}
