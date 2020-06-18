import java.util.*;

public class 모의고사연습 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		int[] answers = {1,2,3,4,5,3,3,3,3,3,3,3,3,3};
		int[] answer = {1,2,3};
        
        int[] a = new int[answers.length];
        int[] b = new int[answers.length];
        int[] c = new int[answers.length];
        int[] d = {1,2,3,4,5};
        int[] e = {2,1,2,3,2,4,2,5};
        int[] f = {3,3,1,1,2,2,4,4,5,5};
        
        int j=0;
        for(int i=0; i<answers.length; i++){
            a[i] = d[j];
            j++;
            if(j>4){
                j=0;
            }
        }
        j=0;
        for(int i=0; i<answers.length; i++){
            c[i] = f[j];
            j++;
            if(j>9){
                j=0;
            }
        }
        j=0;
        for(int i=0; i<answers.length; i++){
            b[i] = e[j];
            j++;
            if(j>7){
                j=0;
            }
        }
        int[] ans = {0,0,0};
        for(int i=0; i<answers.length; i++){
            if(a[i]==answers[i]){
                ans[0]++;
            }
            if(b[i]==answers[i]){
                ans[1]++;
            }
            if(c[i]==answers[i]){
                ans[2]++;
            }
        }
 
        int result = ans[0]>ans[1]?ans[0]:ans[1];
        int result2 = result>ans[2]?result:ans[2];
        if(result2==ans[0])
         list.add(1);
        if(result2==ans[1])
         list.add(2);
        if(result2==ans[2])
         list.add(3);
      
      answer = list.stream().mapToInt(i->i).toArray();
        
	}

}
