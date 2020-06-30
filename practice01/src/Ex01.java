public class Ex01{
	public static void main(String[] args){
		int i=3;
		int j;
		while(i<9){
			
			if(i==3 || i==5){
				System.out.printf("<%d>´Ü\n",i);
				
			}
			j=1;
			while(j<10){
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
			System.out.println();
		}
	
	}
}