import java.util.Scanner;

public class BJ2357 {

	public static void main(String[] args) {
		//시간 초과
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int test = sc.nextInt();
		
		int[] nums = new int[num];
		
		
		for(int i=0; i<num; i++) {
			nums[i] = sc.nextInt();
		}
		
		int[] min = new int[test];
		int[] max = new int[test];
		for(int i=0; i<test; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			min[i]=1000000001;
			max[i]=0;
			for(int j=start-1; j<end; j++) {
				if(nums[j]<min[i]) {
					min[i]=nums[j];
				}
				
				if(nums[j]>max[i]) {
					max[i]=nums[j];
				}
			}
		}
		
		for(int i=0; i<test; i++) {
			System.out.printf("%d %d\n",min[i], max[i]);
		}
	}

}
