import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ex02 {
	public static void main(String[] args){
	List<HashMap<String,String>> abc = new ArrayList<>();
	HashMap<String, String> pMap = new HashMap<>();

	pMap.put("name", "�¹�");
	pMap.put("phone", "010-9112-5924");
	pMap.put("job", "���л�");

	abc.add(pMap);
	
	pMap = null;

	pMap = new HashMap<>();

	pMap.put("name", "â��");
	pMap.put("phone", "010-9112-5924");
	pMap.put("job", "���л�");
	
	abc.add(pMap);

	pMap = null;

	Iterator<HashMap<String, String>> it = abc.iterator();
	while(it.hasNext()){
		HashMap<String, String> rMap = it.next();
		System.out.println(rMap.get("name"));
		System.out.println(rMap.get("phone"));
		System.out.println(rMap.get("job"));
		System.out.println();
	
	rMap=null;
	}
}
}