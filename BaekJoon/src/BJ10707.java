import java.util.Scanner;

public class BJ10707 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Xfare = sc.nextInt();
		int Ybase = sc.nextInt();
		int Ybhigh = sc.nextInt();
		int Yaddf = sc.nextInt();
		int water = sc.nextInt();
		
		int X = Xfare*water;
		int Y;
		if(water>Ybhigh) {
			water-=Ybhigh;
			Y = Ybase+(Yaddf*water);
		}else {
			Y = Ybase;
		}
		if(X>Y) {
			System.out.println(Y);
		}else {
			System.out.println(X);
		}
		
	}

}
