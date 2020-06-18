
public class x만큼간격n개숫자 {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long start=0;
        for(int i=0; i<n; i++) {
        	start+=x;
        	answer[i]=start;
        }
        return answer;
    }
}
