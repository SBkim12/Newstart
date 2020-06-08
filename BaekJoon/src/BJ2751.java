import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int[] num = new int[test];
		for(int i=0; i<test; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(num);
		
		for(int i=0; i<test; i++) {
			System.out.println(num[i]);
		}
	}
}
