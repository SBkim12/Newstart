
public class Pickstar4 {

	public static void main(String[] args) {
		
		int a, b, c;
		for(a=1; a<=6; a++) {
			for(b=6; b>a; b--) {
				System.out.printf(" ");
			}
			for(c=1; c<=a; c++) {
				System.out.printf("*");
			}
			System.out.println(" ");
		}
		for(a=5; a>=1; a--) {
			for(b=6; b>a; b--) {
				System.out.printf(" ");
			}
			for(c=1; c<=a; c++) {
				System.out.printf("*");
			}
			System.out.println(" ");
		}
	}

}
