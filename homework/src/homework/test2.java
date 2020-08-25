package homework;

public class test2 {

	public static void main(String[] args) {
		int i=3;
		while(i<9) {
			if(i==3 || i==5) {
				System.out.println("<"+i+"´Ü>");
			}
			int j=1;
			while(j<10) {
				System.out.printf("%d * %d = %d\n", i, j ,i*j);
				j++;
			}
			i++;
			System.out.println();
		}
		
	}

}
