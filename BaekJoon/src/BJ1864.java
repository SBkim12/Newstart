import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ1864 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> num = new ArrayList<>();
		while(true) {
			String octo = sc.nextLine();
			if(octo.equals("#"))
				break;
			num.add(chglan(octo));
		}
		
		Iterator<Integer> it = num.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
	public static int chglan(String A) {
		String[] change = A.split("");
		int ans = 0;
		for(int i=0; i<change.length; i++) {
			if(change[i].equals("-")) {
				ans+=0*Math.pow(8,(change.length-i-1));
			}else if(change[i].equals("\\")) {
				ans+=1*Math.pow(8,(change.length-i-1));
			}else if(change[i].equals("(")) {
				ans+=2*Math.pow(8,(change.length-i-1));
			}else if(change[i].equals("@")) {
				ans+=3*Math.pow(8,(change.length-i-1));
			}else if(change[i].equals("?")) {
				ans+=4*Math.pow(8,(change.length-i-1));
			}else if(change[i].equals(">")) {
				ans+=5*Math.pow(8,(change.length-i-1));
			}else if(change[i].equals("&")) {
				ans+=6*Math.pow(8,(change.length-i-1));
			}else if(change[i].equals("%")) {
				ans+=7*Math.pow(8,(change.length-i-1));
			}else if(change[i].equals("/")) {
				ans+=-1*Math.pow(8,(change.length-i-1));
			}
		}
		return ans;
	}

}
