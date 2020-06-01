import java.util.*;
public class BJ1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num = sc.nextLine();

		String[] nums = num.split(" ");
		int height = Integer.parseInt(nums[0]);
		int width = Integer.parseInt(nums[1]);

		String[][] plate = new String[height][width];
		int resta = height-8;
		int restb = width-8;
		int ans =64;


		for(int i=0; i<height; i++) {
			String lines = sc.nextLine();
			String[] line = lines.split("", width);
			for(int j=0; j<width; j++) {
				plate[i][j]=line[j];
			}
		}
		
		for(int i=0; i<resta+1; i++) {
			for(int j=0; j<restb+1; j++) {
				int change =0;
				int change1 =0;
				for(int I=i; I<i+8; I++) {
					for(int J=j; J<j+8; J++) {
						if((i+1)%2==0) {
							if((j+1)%2==0) {
								if(!plate[i][j].equals("W")) { 
									change++;	
								}
							}else if((j+1)%2==1) {
								if(!plate[i][j].equals("B")) {
									change++;
								}
							}
						}else {
							if((j+1)%2==0) {
								if(!plate[i][j].equals("B")) {
									change++;	
								}
							}else if((j+1)%2==1) {
								if(!plate[i][j].equals("W")) {
									change++;
								}
							}
						}
						if((i+1)%2==0) {
							if((j+1)%2==0) {
								if(!plate[i][j].equals("B")) { 
									change1++;	
								}
							}else if((j+1)%2==1) {
								if(!plate[i][j].equals("W")) {
									change1++;
								}
							}
						}else {
							if((j+1)%2==0) {
								if(!plate[i][j].equals("W")) {
									change1++;	
								}
							}else if((j+1)%2==1) {
								if(!plate[i][j].equals("B")) {
									change1++;
								}
							}
						}
						
					}
				}
				System.out.println(change);
				change=change<change1?change:change1;
				ans=ans<change?ans:change;
			}
		}
		System.out.println(ans);
	}
}
