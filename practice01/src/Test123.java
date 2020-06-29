import java.util.Scanner;

public class Test123 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String n = sc.nextLine();
		
		String[] num = n.split("");
		
		int answer =0;
		for(int i=0; i<num.length; i++) {
			answer+=Integer.parseInt(num[i]);
		}
		System.out.println(answer);
	}

}
