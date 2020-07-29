import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1395 {

	public static void main(String[] args)throws IOException{
		
		//시간초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		String a = br.readLine();
		
		String[] x = a.split(" ");
		
		int button = Integer.parseInt(x[0]);
		
		int work = Integer.parseInt(x[1]);
		
		int[] buttons = new int[button];
		
		for(int i=0; i<button; i++) {
			buttons[i]=0;
		}
		
		for(int i=0; i<work; i++) {
			
			String b = br.readLine();
			
			String[] y = b.split(" ");
			
			int what = Integer.parseInt(y[0]);
			
			int start = Integer.parseInt(y[1]);
			
			int end = Integer.parseInt(y[2]);
			
			if(what == 0) {
				for(int j=start-1; j<=end-1; j++) {
					if(buttons[j]==1) {
						buttons[j]=0;
					}else {
						buttons[j]=1;
					}
				}
			}else {
				int ans=0;
				for(int j=start-1; j<=end-1; j++) {
					if(buttons[j]==1) {
						ans++;
					}
				}
				System.out.println(ans);
			}
		}
	}

}
