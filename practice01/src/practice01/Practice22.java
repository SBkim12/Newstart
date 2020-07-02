package practice01;

public class Practice22 {

	public static void main(String[] args) {
		int[] test = {80,90,40,30,20};
		
		for(int i = 0; i<5; i++) {
			System.out.println((i+1) + "번째 사람의 정수는" + test[i] + "점 입니다.");
		}
		
		System.out.println("시험의 응시자 수는" + test.length + "명 입니다.");
	}

}