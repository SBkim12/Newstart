import java.util.Scanner;

public class BJ11718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String word = sc.nextLine();
			
			if(word.isEmpty() || word.length()>100) {
				break;
			}else {
				System.out.println(word);
			}
		}
	}

}
