import java.util.Scanner;

public class BJ5575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int astarh = sc.nextInt();
		int astarm = sc.nextInt();
		int astars = sc.nextInt();
		int aendh = sc.nextInt();
		int aendm = sc.nextInt();
		int aends = sc.nextInt();
		
		int bstarh = sc.nextInt();
		int bstarm = sc.nextInt();
		int bstars = sc.nextInt();
		int bendh = sc.nextInt();
		int bendm = sc.nextInt();
		int bends = sc.nextInt();
		
		int cstarh = sc.nextInt();
		int cstarm = sc.nextInt();
		int cstars = sc.nextInt();
		int cendh = sc.nextInt();
		int cendm = sc.nextInt();
		int cends = sc.nextInt();
		
		int aworks = aends - astars;
		int aworkm = aendm - astarm;
		int aworkh = aendh - astarh;
		if(aworks<0) {
			aworks+=60;
			aworkm--;
		}
		if(aworkm<0) {
			aworkm+=60;
			aworkh--;
		}
		
		int bworks = bends - bstars;
		int bworkm = bendm - bstarm;
		int bworkh = bendh - bstarh;
		if(bworks<0) {
			bworks+=60;
			bworkm--;
		}
		if(bworkm<0) {
			bworkm+=60;
			bworkh--;
		}
		
		int cworks = cends - cstars;
		int cworkm = cendm - cstarm;
		int cworkh = cendh - cstarh;
		if(cworks<0) {
			cworks+=60;
			cworkm--;
		}
		if(cworkm<0) {
			cworkm+=60;
			cworkh--;
		}
		System.out.printf("%d %d %d\n", aworkh, aworkm, aworks);
		System.out.printf("%d %d %d\n", bworkh, bworkm, bworks);
		System.out.printf("%d %d %d\n", cworkh, cworkm, cworks);
	}

	

}
