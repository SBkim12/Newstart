import java.util.Scanner;

public class BJ5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		char[] n = name.toCharArray();
		
		int dial ;
		int time=0;
		
		for(int i=0; i<n.length; i++) {
			if(n[i]>=65 && n[i]<=67 ) {
				time+=3;
			}
			if(n[i]>=68 && n[i]<=70 ) {
				time+=4;
			}
			if(n[i]>=71 && n[i]<=73 ) {
				time+=5;
			}
			if(n[i]>=74 && n[i]<=76 ) {
				time+=6;
			}
			if(n[i]>=77 && n[i]<=79 ) {
				time+=7;
			}
			if(n[i]>=80 && n[i]<=83 ) {
				time+=8;
			}
			if(n[i]>=84 && n[i]<=86 ) {
				time+=9;
			}
			if(n[i]>=87 && n[i]<=90 ) {
				time+=10;
			}
		}
		System.out.println(time);
	}

}
