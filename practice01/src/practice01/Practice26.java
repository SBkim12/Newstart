package practice01;

public class Practice26 {

	public static void main(String[] args) {
		int[][] test = {
				{80,60,30,50}, {23,65,36,26}, {15,87,75}
		};
		
		for(int i=0; i<test.length; i++) {
			System.out.println((i+1) + "번째 배열 요소의 길이는" + test[i].length + "입니다.");
		}

	}

}
