package practice01;

public class Practice25 {

	public static void main(String[] args) {
		int [][] test;
		test = new int[2][5];
		
		test[0][0] = 80;
		test[0][1] = 60;
		test[0][2] = 22;
		test[0][3] = 50;
		test[0][4] = 75;
		test[1][0] = 90;
		test[1][1] = 68;
		test[1][2] = 72;
		test[1][3] = 60;
		test[1][4] = 58;
		
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "번째 사람의 국어 점수는" + test[0][i] + "입니다.");
			System.out.println((i+1) + "번째 사람의 수학 점수는" + test[1][i] + "입니다.");
		}

	}

}
