
public class ���ڿ��ٷ��⺻ {

	public static void main(String[] args) {
		String s = "12345";
		boolean answer = true;
		if(s.length()!=4 && s.length()!=6) {
			answer = false;
		}
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='A') {
				answer = false;
			}
		}
		System.out.println(answer);
	}

}
