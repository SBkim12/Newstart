import java.util.Scanner;

public class BJ17256 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ax = sc.nextInt();
		int ay = sc.nextInt();
		int az = sc.nextInt();
		int cx = sc.nextInt();
		int cy = sc.nextInt();
		int cz = sc.nextInt();
		int bx = cx-az;
		int by = cy/ay;
		int bz = cz-ax;
		
		System.out.printf("%d %d %d",bx, by, bz);
	}

}