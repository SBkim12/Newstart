import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ2765 {
//런타임 에러가 뜸 ㅜㅜㅜ.ㅜ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r;
		int roll=1;
		int sec;
		double pie = 3.1415927;
		List<Double> distance = new ArrayList<>();
		List<Double> MPH = new ArrayList<>();
		
		while(true) {
			r=sc.nextDouble()/2;
			roll=sc.nextInt();
			sec=sc.nextInt();
			if(roll==0) {
				break;
			}
			double distances = 2*pie*r*roll/12/5280;
			distance.add(distances);
			MPH.add(distances/sec*3600);
		}
		Iterator<Double> it = distance.iterator();
		Iterator<Double> its = MPH.iterator();
		
		int a=1;
		while(it.hasNext()) {
			System.out.printf("Trip #%d: ",a);
			System.out.printf("%.2f ",it.next());
			System.out.printf("%.2f\n",its.next());
			a++;
		}
	}

}
