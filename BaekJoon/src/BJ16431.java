import java.util.Scanner;

public class BJ16431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bx = sc.nextInt();
		int by = sc.nextInt();

		int dx = sc.nextInt();
		int dy = sc.nextInt();

		int jx = sc.nextInt();
		int jy = sc.nextInt();
		
		if(bx>jx) {
			bx-=jx;
			if(by>jy) {
				by-=jy;
			}else {
				by=jy-by;
			}
		}else {
			bx=jx-bx;
			if(by>jy) {
				by-=jy;
			}else {
				by=jy-by;
			}
		}
		int bcount =0;
		while(bx>0 && by>0) {
			bx--;
			by--;
			bcount++;
		}
		bcount+=bx+by;
		
		if(dx>jx) {
			dx-=jx;
			if(dy>jy) {
				dy-=jy;
			}else {
				dy=jy-dy;
			}
		}else {
			dx=jx-dx;
			if(dy>jy) {
				dy-=jy;	
			}else {
				dy=jy-dy;
			}
		}
		int dcount =dy+dx;
		if(bcount<dcount) {
			System.out.println("bessie");
		}else if(bcount==dcount) {
			System.out.println("tie");
		}else {
			System.out.println("daisy");
		}
	}

}
