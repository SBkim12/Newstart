import java.util.Scanner;

public class BJ1212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ten = Integer.valueOf(sc.nextLine(), 8);
		String two = Integer.toBinaryString(ten);
		
		System.out.println(two);
	}

}
