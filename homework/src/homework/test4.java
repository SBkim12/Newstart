package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test4 {

	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();
		
		rList.add("객체지향프로그래밍");
		rList.add("하둡");
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
