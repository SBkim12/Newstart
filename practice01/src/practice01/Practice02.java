package practice01;

public class Practice02 {

	public static void main(String[] args) {
		int a = 10;
		int result;
		
		result = 10 + ++a + 10;
		System.out.printf("result : %d \n", result);
		System.out.printf("a : %d \n", a);
		
		result = 10 + a++ + 10;
		System.out.printf("result : %d \n", result);
		System.out.printf("a : %d \n", a);
	}

}
