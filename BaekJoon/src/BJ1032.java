import java.util.Scanner;

public class BJ1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int file = sc.nextInt();

		String[] files = new String[file];

		String pass = sc.nextLine();

		files[0] = sc.nextLine();
		int[] name = new int[files[0].length()];
		for(int j=0; j<files[0].length(); j++) {
			name[j]=0;
		}
		String[] main = files[0].split("");
		for(int i=1; i<file; i++) {
			files[i] = sc.nextLine();

			String[] sub = files[i].split("");

			for(int j=0; j<files[i].length(); j++) {
				if(name[j]==0) {
					if(!main[j].equals(sub[j])){
						name[j]++;
						main[j]="?";
					}
				}
			}
		}
		for(int i=0; i<main.length; i++) {
			System.out.print(main[i]);
		}
	}

}
