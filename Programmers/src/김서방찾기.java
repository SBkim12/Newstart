
public class �輭��ã�� {
	public String solution(String[] seoul) {
		String answer = "";
		for(int i=0; i<20; i++) {
			if(seoul[i].equals("Kim")) {
				answer = "�輭���� "+i+"�� �ִ�.";
				break;
			}
		}
		return answer;
	}
}