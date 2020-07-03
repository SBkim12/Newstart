
public class Pickstar2 {

	public static void main(String[] args) {
		
		int a, b;
		for(a=1; a<6; a++) {
			for(b=1; b<=a; b++) {
				System.out.printf("*");
			}
			System.out.println(" ");
		}
		for(a=6; a>=1; a--) {
			for(b=1; b<=a; b++) {
				System.out.printf("*");
			}
			System.out.println(" ");
		}

	}

}
