import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		ArrayList<Integer> answers = new ArrayList<>();
		int nope =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answers.add(arr[i]);
                nope++;
            }

        }
        if(nope==0){
            answers.add(-1);
        }
        System.out.println(answers);
        int[] answer = new int[answers.size()];
        for(int i=0; i<answers.size(); i++) {
        	answer[i]=answers.get(i);
        }
        Arrays.sort(answer);
        
        System.out.println(answer);
 

	}

}
