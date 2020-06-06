import java.util.Scanner;

public class BJ1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		word = word.toUpperCase();
		
		char[] words = word.toCharArray();
		
		int[] count = new int[26];	
		int[] alpha = new int[26];		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = 65+i;
			count[i] = 0;
		}
		
		for(int i=0; i<words.length; i++) {
			for(int j=0; j<alpha.length; j++) {
				if((int)words[i] == alpha[j]) {
					count[j]+=1;
					break;
				}
			}
		}
		
		
		int max =0;
		for(int i=0; i<count.length; i++) {
			max= max>count[i]?max:count[i];
		}
		int two=0;
		for(int i=0; i<count.length; i++) {
			if(max==count[i]) {
				two++;
				
			}
		}
		
		
		if(two>=2) {
			System.out.println("?");
		}else {
			int num =0;
			int answer=0;
			for(int i=0; i<alpha.length; i++) {
				if(max==count[i]) {
					answer=alpha[i];
				}
			}
			System.out.println((char)answer);
		}
		
	}

}
