import java.util.Scanner;

public class BJ3846 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		String pass = sc.nextLine();
		
		String[][] a = new String[test][2];
		String[] ans = new String[test];
		String[] answer = new String[test];
		for(int i=0; i<test; i++) {
			String line = sc.nextLine();
			
			a[i] = line.split(" ");
			
			String[] c = a[i][0].split("");
			String[] d = a[i][1].split("");
			String A = "";
			String B = "";
			for(int j=c.length-1; j>=0; j--) {
				A+=c[j];
			}
			for(int j=d.length-1; j>=0; j--) {
				B+=d[j];
			}
			
			int anss = Integer.parseInt(A)+Integer.parseInt(B);
			ans[i] = String.valueOf(anss);
			
		}
		for(int i=0; i<test; i++) {
			answer[i]="";
			String[] c = ans[i].split("");
			for(int j=c.length-1; j>=0; j--) {
				answer[i]+=c[j];
			}
			System.out.println(Integer.parseInt(answer[i]));
		}
		
	}

}
