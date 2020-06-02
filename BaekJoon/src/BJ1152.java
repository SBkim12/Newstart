import java.util.Scanner;

public class BJ1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		a = a.trim();
		String[] b = a.split(" ");
		if(b[0].equals(""))
			System.out.println(0);
		else
		System.out.print(b.length);
	}

}
