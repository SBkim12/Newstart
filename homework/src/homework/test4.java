package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test4 {

	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();
		
		rList.add("��ü�������α׷���");
		rList.add("�ϵ�");
		rList.add("MongoDB");
		
		int a =1;
		
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			if(a==1) {
				System.out.println("<"+it.next()+">");
			}else {
				System.out.println(it.next());
			}
			a++;
		}
	}

}
