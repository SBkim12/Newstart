
public class Çà·ÄÀÇµ¡¼À {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		int[][] arr = new int[arr1.length][arr1[0].length]; // @1
		for(int i=0; i<arr1.length; i++) { // @2
			for(int j=0; j<arr1[0].length; j++) { // @3
				arr[i][j] = arr1[i][j] + arr2[i][j]; // @4
			}
		}
        System.out.println(arr[0][1]);
       
	}

}
