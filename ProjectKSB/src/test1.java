import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class test1 {

	public static void main(String[] args) {
		for(int i=3; i<9; i++) {
			if(i==3 || i==5) {
				System.out.printf("<%d단>\n",i);
			}
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		int i=3;
		while(i<9) {
			if(i==3 || i==5) {
				System.out.printf("<%d단>\n",i);
			}
			int j=1;
			while(j<10) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
		int[] num =new int[90];
		
		for(i=0; i<90; i++) {
			num[i]=i+11;
		}
		for(i=0; i<num.length; i++) {
			System.out.println(i+1+"번째 수는 : " + num[i]);
		}
		
		
		
		
		
		List<String> name = new ArrayList<String>();
		
		name.add("김승범");
		name.add("함지민");
		name.add("김창영");
		
		System.out.println(name.size());
		System.out.println(name.get(0) + name.get(1) + name.get(2));
		
		Iterator<String> it = name.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		List<Map<String,String>> rList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<>();
		
		pMap.put("이름", "김승범");
		pMap.put("나이", "24");
		pMap.put("직업", "학생");
		
		rList.add(pMap);
		
		pMap = null;
		
		pMap = new HashMap<>();
		
		pMap.put("이름", "김창영");
		pMap.put("나이", "24");
		pMap.put("직업", "학생");
		
		rList.add(pMap);
		
		pMap=null;
		
		Iterator<Map<String,String>> it1 = rList.iterator();
		while(it1.hasNext()) {
			Map<String,String> rMap = it1.next();
			
			System.out.println("이름은 : " + rMap.get("이름"));
			System.out.println("나이는 : " + rMap.get("나이"));
			System.out.println("직업은 : " + rMap.get("직업"));
			
			rMap=null;
		}
		
		
		
		
		for(int a=0; a<4; a++) {
			for(int b=3; b>=0; b--) {
				if(a>=b) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int a=0; a<3; a++) {
			for(int b=0; b<4; b++) {
				if(a>=b) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
