import java.util.Scanner;

public class BJ5523 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int round = sc.nextInt();
		
		int a;
		int b;
		int awin =0;
		int bwin =0;
		for(int i=0; i<round; i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>b) {
				awin++;
			}else if(a==b) {
				
			}else {
				bwin++;
			}
		}
		System.out.printf("%d %d",awin, bwin);
	}

}
