import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ2749 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Long> fibo = new ArrayList<>();
		long num = Long.parseLong(br.readLine());
		long pisano = 1500000; //피사노주기
		if(num>=pisano) {
			num%=pisano;
		}
		fibo.add(0L);
		fibo.add(1L);
		for(int i=2; i<pisano && i<=num; i++) {
			fibo.add((fibo.get(i-1)+fibo.get(i-2))%1000000);
		}
		
		
		System.out.println(fibo.get((int)num));
	}

}
