import java.util.Scanner;

public class BJ2592 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		int[] many = new int[100];
		
		int hap = 0;
		
		for(int i=0; i<100; i++) {
			many[i]=0;
		}
		
		int max =0;
		int ans =0;
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
			hap+=num[i];
			num[i]/=10;
			many[num[i]]++;
			if(many[num[i]]>max) {
				max=many[num[i]];
				ans=num[i]*10;
			}
		}
		
		System.out.printf("%d %d",hap/10, ans);
		
		
	}

}
