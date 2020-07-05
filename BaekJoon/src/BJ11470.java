import java.util.Scanner;

public class BJ11470 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int meat = sc.nextInt();
		int high = sc.nextInt();
		int frez = sc.nextInt();
		int melt = sc.nextInt();
		int warm = sc.nextInt();
		
		int time =0;
		while(meat<high) {
			if(meat<0) {
				meat++;
				time+=frez;
			}else if(meat==0) {
				time+=melt;
				meat++;
				time+=warm;
			}else if(meat>0) {
				meat++;
				time+=warm;
			}
		}
		System.out.println(time);
	}
}
