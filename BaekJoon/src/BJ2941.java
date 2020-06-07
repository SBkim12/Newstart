import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class BJ2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();
		word = word.replace("-", "");
		word = word.replace("=", "");

		char[] words = word.toCharArray();
		int num = 0;
		if(words.length<=1) {
			num=1;
		}
		else {
			for(int i=0; i<words.length; i++) {
				if(words[i] == 'd' && words[i+1] == 'z'){

				}else if(words[i] == 'l' && words[i+1] == 'j') {

				}else if(words[i] == 'n' && words[i+1] == 'j') {

				}else {
					num++;
				}
			}
		}
		bw.write(String.valueOf(num));
		bw.flush();

	}

}