package practice01;

public class Practice20 {

	public static void main(String[] args) {
		int[] test;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 50;
		test[2] = 14;
		test[3] = 99;
		test[4] = 80;
	
		for(int i =0; i<5; i++) {
			System.out.println(( i +1) + "번째 사람의 점수는" + test[i] + "입니다.");
		}
	}

}
