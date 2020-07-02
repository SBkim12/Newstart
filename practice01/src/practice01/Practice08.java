package practice01;

public class Practice08 {

	public static void main(String[] args) {
		int i = 1;
		//조건을 판단하기전 do문을 적어도 1번 실행시킨다.
		do {
			System.out.println(i+ "번째 반복입니다.");
			i++;
		} while(i<=5);
		
		System.out.println(i-1 + "번 반복이 끝났습니다.");

	}

}
