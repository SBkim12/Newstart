import java.util.Arrays;
import java.util.Scanner;

public class BJ1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num = sc.nextLine();
		
		int size = num.length();
		char[] nums = new char[size];
		
		for(int i=0; i<num.length(); i++) {
			nums[i] = num.charAt(i);
		}
		
		Arrays.sort(nums);
		
		for(int i=nums.length-1; i>=0; i--) {
			System.out.print(nums[i]);
		}
	
	}

}
