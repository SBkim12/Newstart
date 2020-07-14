import java.util.Scanner;

public class BJ2864 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max =0;
		int min =0;
		
		int x=0;
		while(a>=1) {
			if(a%10==5) {
				min+=a%10*(Math.pow(10,x));
				max+=(a%10+1)*(Math.pow(10,x));
			}else if(a%10==6) {
				min+=(a%10-1)*(Math.pow(10,x));
				max+=(a%10)*(Math.pow(10,x));
			}else {
				min+=a%10*(Math.pow(10,x));
				max+=a%10*(Math.pow(10,x));
			}
			
			a/=10;
			x++;
		}
		
		int c=0;
		while(b>=1) {
			if(b%10==5) {
				min+=b%10*(Math.pow(10,c));
				max+=(b%10+1)*(Math.pow(10,c));
			}else if(b%10==6) {
				min+=(b%10-1)*(Math.pow(10,c));
				max+=(b%10)*(Math.pow(10,c));
			}else {
				min+=b%10*(Math.pow(10,c));
				max+=b%10*(Math.pow(10,c));
			}
			
			b/=10;
			c++;
		}
		
		System.out.printf("%d %d",min, max);
	}

}
