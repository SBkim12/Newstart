package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class test5 {

	public static void main(String[] args) {
		List<Map<String,String>> rList = new ArrayList<>();
		Map<String,String> pMap = new HashMap<>();
		
		pMap.put("name", "ÀÌÇù°Ç");
		pMap.put("Email", "h.lee@");
		pMap.put("addr", "¼­¿ï");
		
		rList.add(pMap);
		pMap=null;
		pMap=new HashMap<>();
		
		pMap.put("name", "È«±æµ¿");
		pMap.put("Email", "g.hong@");
		pMap.put("addr", "°æ±â");
		
		rList.add(pMap);
		pMap=null;
		
		Iterator<Map<String,String>> it = rList.iterator();
		while(it.hasNext()) {
			Map<String,String> rMap = it.next();
			
			System.out.println("name : "+rMap.get("name"));
			System.out.println("Email : "+rMap.get("Email"));
			System.out.println("addr : "+rMap.get("addr"));
			System.out.println();
		}
	}

}
