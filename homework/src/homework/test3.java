package homework;

public class test3 {

	public static void main(String[] args) {
		int[] num = new int[90];
		int hap=0;
		
		for(int i=0; i<90; i++) {
			num[i] = 11 +i;
			hap+=num[i];
			System.out.printf("num[%d] : %d\n",i, num[i]);
		}
		System.out.println("гу : "+ hap);
		
		
	}

}
