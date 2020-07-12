import java.util.Scanner;

public class BJ2490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] yoot = new int[12];
		
		
		for(int i=0; i<12; i++) {
			yoot[i]=sc.nextInt();
		}
		System.out.println(change(yoot[0]+yoot[1]+yoot[2]+yoot[3]));
		System.out.println(change(yoot[4]+yoot[5]+yoot[6]+yoot[7]));
		System.out.println(change(yoot[8]+yoot[9]+yoot[10]+yoot[11]));
		
		
	}
	public static char change(int num) {
		if(num==4) {
			return 'E';
		}else if(num==3) {
			return 'A';
		}else if(num==2) {
			return 'B';
		}else if(num==1) {
			return 'C';
		}else{
			return 'D';
		}
	}

}
