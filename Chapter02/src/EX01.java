
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class EX01{
	public static void main(String[] args){
	List<String> name = new ArrayList<>();

	name.add("±è½Â¹ü");
	name.add("±èÅÂ¹ü");

	for(int i=0; i<name.size(); i++){
		System.out.println(name.get(i));
	}
	
	Iterator<String> N = name.iterator();
	
	while(N.hasNext()){
	System.out.println(N.next());
	}
	}
}