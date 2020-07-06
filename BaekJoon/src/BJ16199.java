import java.util.Scanner;

public class BJ16199 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int byear = sc.nextInt();
		int bmonth = sc.nextInt();
		int bday = sc.nextInt();

		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int mage;
		if(month>bmonth || (month==bmonth && day>=bday)) {
			mage=year-byear;
		}else {
			mage=year-byear-1;
		}
		int kage = year-byear+1;
		
		int yage = year-byear;
		
		System.out.printf("%d\n%d\n%d\n",mage,kage,yage);
	}

}
