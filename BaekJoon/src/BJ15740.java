import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ15740 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = br.readLine().split(" ");
		String a = inputs[0];
		String b = inputs[1];
		
		BigInteger A = new BigInteger(a);
		BigInteger B = new BigInteger(b);
		
		System.out.println(A.add(B).toString());
	}	
}
