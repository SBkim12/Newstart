import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> nums = new ArrayList<>();
		int a=0;
		while(true) {
			String num =sc.nextLine();
			if(num.equals("0")) {
				break;
			}
			String[] numss = num.split("");
			int sum=numss.length+1;
			for(int i=0; i<numss.length; i++) {
				if(numss[i].equals("0")) {
					sum+=4;
				}else if(numss[i].equals("1")) {
					sum+=2;
				}else if(numss[i].equals("2") || numss[i].equals("3") || numss[i].equals("4") || numss[i].equals("5") || numss[i].equals("6") || numss[i].equals("7") || numss[i].equals("8") || numss[i].equals("9") ){
					sum+=3;
				}

			}
			nums.add(sum);
		}
		Iterator<Integer> it = nums.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
