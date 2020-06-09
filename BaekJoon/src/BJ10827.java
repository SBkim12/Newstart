import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BJ10827 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = br.readLine().split(" ");
		String a = inputs[0];
		String b = inputs[1];
		
		BigDecimal A = new BigDecimal(a);
		int B = Integer.parseInt(b);
		
		
		System.out.println(A.pow(B).toPlainString());
	}	
}
