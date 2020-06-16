import java.util.Scanner;

public class BJ2137 {
//¸ð¸£°Ù´ç
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double bun = sc.nextDouble()/sc.nextDouble();
		int a=1;
		double b=32767;
		while(bun>=a/b) {
			a++;
			
		}
		if(Math.abs(bun-a/b)>Math.abs((a+1)/b-bun)) {
			a+=1;
		}
		
		int i=2;
		while(a>=i) {
			if(a%i==0 & b%i==0) {
				a/=i;
				b/=i;
			}else {
				i++;
			}
		}
		System.out.printf("%d %d",a,(int)b);
	}
	

}
