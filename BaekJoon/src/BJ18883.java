import java.util.Scanner;

public class BJ18883 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//시간 초과
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		String[] num = new String[N];
		for(int i=0; i<N; i++) {
			num[i]="";
			for(int j=1; j<=M; j++) {
				if(j==1) {
					num[i]+=Integer.toString(i*M+j);
				}else {
					num[i]+=" "+Integer.toString(i*M+j);
				}
			}
			System.out.printf("%s\n",num[i]);
		}
		
		
	}

}
