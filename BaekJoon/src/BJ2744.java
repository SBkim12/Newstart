import java.util.Scanner;

public class BJ2744 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String word = sc.nextLine();
		
		char[] words = word.toCharArray();
		
		for(int i=0; i<words.length; i++) {
			if(words[i]>=97) {
				words[i]=Character.toUpperCase(words[i]);
			}else {
				words[i]=Character.toLowerCase(words[i]);
			}
			System.out.print(words[i]);
		}
	}

}
