
public class ���ڿ��ٷ��⺻_�ٸ�Ǯ�� {

	public static void main(String[] args) {
		String s = "1234";
		boolean answer = true;
		try{
            Integer.parseInt(s);
            if(s.length()!=4 && s.length()!=6){
                answer=false;
            }
        }catch(Exception e){
            answer =false;
        }
		System.out.println(answer);
	}

}
