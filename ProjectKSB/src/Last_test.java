import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Last_test {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=3; j>=0; j--) {
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				if(i>=j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		List<String> name = new ArrayList<String>();
		
		name.add("��¹�");
		name.add("��â��");
		name.add("������");
		
		System.out.println(name.get(2));
		System.out.println(name.size());
		
		Iterator<String> it = name.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<Map<String, String>> rList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<>();
		
		pMap.put("�̸�", "��¹�");
		pMap.put("�ּ�", "��õ");
		pMap.put("����", "24");
		
		rList.add(pMap);
		
		pMap=null;
		
		pMap = new HashMap<>();
		
		pMap.put("�̸�", "��â��");
		pMap.put("�ּ�", "����");
		pMap.put("����", "24");
		
		rList.add(pMap);
		
		pMap=null;
		
		Iterator<Map<String, String>> its = rList.iterator();
		while(its.hasNext()) {
			Map<String, String> rMap = its.next();
			
			System.out.println("�̸��� : " + rMap.get("�̸�"));
			System.out.println("�ּ��� : " + rMap.get("�ּ�"));
			System.out.println("������ : " + rMap.get("����"));
			
			System.out.println();
			rMap = null;
			
			for(int i=0; i<4; i++){
				for(int j=3; j>=0; j--){
				if(i>=j) {
				System.out.print("*");
				}
				else
				System.out.print(" ");
				}
				System.out.println();
				}
				for(int i=0; i<3; i++){
				for(int j=0; j<4; j++){
				if(i>=j)
				System.out.print(" ");
				else
				System.out.print("*");
				}
				System.out.println();
				}
		}
	}

}
