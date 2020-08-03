import java.util.Scanner;

public class BJ1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] months = {0, 31, 28 ,31, 30,31,30,31,31,30,31,30};
		
		for(int i=0; i<month; i++) {
			day+=months[i];
		}
		
		day%=7;
		
		if(day==0) {
			System.out.println("SUN");
		}else if(day==1) {
			System.out.println("MON");
		}else if(day==2) {
			System.out.println("TUE");
		}else if(day==3) {
			System.out.println("WED");
		}else if(day==4) {
			System.out.println("THU");
		}else if(day==5) {
			System.out.println("FRI");
		}else if(day==6){
			System.out.println("SAT");
		}
	}
}