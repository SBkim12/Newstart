public class Practice1 {

	public static void main(String[] args){
		for(int i=3; i<9; i++){
			if(i==3 || i==5){
				System.out.printf("<%d´Ü>\n",i);
			}
			for(int j=1; j<10; j++){
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		System.out.println();
		}
	}
}

