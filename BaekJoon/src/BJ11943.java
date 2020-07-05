import java.util.Scanner;

public class BJ11943 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] box1 = new int[2];
		int[] box2 = new int[2];
		
		box1[0]=sc.nextInt();
		box1[1]=sc.nextInt();
		box2[0]=sc.nextInt();
		box2[1]=sc.nextInt();
		
		if(box1[1] + box2[0]<box1[0]+box2[1]) {
			System.out.println(box1[1] + box2[0]);
		}else {
			System.out.println(box1[0]+box2[1]);
		}
		
	}	

}
