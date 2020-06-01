
public class BJ4673 {

	public static void main(String[] args) {
		boolean[] num = new boolean[10036];
		for(int i=1; i<=10000; i++) {
			num[selfnum(i)]=true;
			if(num[i]!=true) {
				System.out.println(i);
			}
	}

	}
	public static int selfnum(int num) {
		int tmp = num;
		if(num >=10000) {tmp+= num/10000; num%=10000;}
		if(num >=1000) {tmp+= num/1000; num%=1000;}
		if(num >=100) {tmp+= num/100; num%=100;}
		if(num >=10) {tmp+= num/10; num%=10;}
		return tmp += num;
	}

}
