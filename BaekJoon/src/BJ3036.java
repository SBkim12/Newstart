import java.util.Scanner;

public class BJ3036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ringnum = sc.nextInt();
		
		int[] ring = new int[ringnum];
		
		for(int i=0; i<ringnum; i++) {
			ring[i]=sc.nextInt();
		}
		for(int i=1; i<ringnum; i++) {
			int start=2;
			int bestlow=1;
			int a = ring[0];
			int b = ring[i];
			while(true) {
				if(a%start==0 && b%start==0) {
					a=a/start;
					b=b/start;
				}else {
				start++;
				}
				if(start>a || start>b) {
					break;
				}
			}
			System.out.println(a+"/"+b);
		}
	}

}
