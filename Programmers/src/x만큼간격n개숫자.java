
public class x��ŭ����n������ {
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
