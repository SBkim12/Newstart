import java.util.Scanner;

public class BJ2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int[] num = new int[8];
		 
		 int up =0;
		 num[0]=sc.nextInt();
		 for(int i=1; i<8; i++) {
			 num[i]=sc.nextInt();
			 if(num[i]>num[i-1]) {
				 up++;
			 }
		 }
		 
		 if(up==7) {
			 System.out.println("ascending");
		 }else if(up==0){
			 System.out.println("descending");
		 }else {
			 System.out.println("mixed");
		 }
	}

}
