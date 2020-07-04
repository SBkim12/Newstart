import java.util.Scanner;

public class BJ5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] min = new int[4];
		int[] man = new int[4];
		int minhap =0;
		int manhap =0;
		
		for(int i=0; i<4; i++) {
			min[i] = sc.nextInt();
			minhap+=min[i];
		}
		for(int i=0; i<4; i++) {
			man[i] = sc.nextInt();
			manhap+=man[i];
		}
		
		System.out.println(minhap>manhap?minhap:manhap);
	}

}
