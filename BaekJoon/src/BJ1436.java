import java.util.Scanner;

public class BJ1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String start = "666";
		int count=0;
		String answer="";
		while(count!=num) {
			if(start.contains("666")) {
				count++;
				answer=start;
			}
			int a= Integer.parseInt(start)+1;
			start = String.valueOf(a);
		}
		System.out.println(answer);
	}

}
