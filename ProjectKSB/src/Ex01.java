import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Ex01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try {
			
		
		int[][] miro = new int[10][10];
		ArrayList<String> input = new ArrayList<>();
		for(int i=0; i<10; i++) {
			input.add(sc.nextLine());
			String[] jum = input.get(i).split(" ");
			for(int j=0; j<10; j++) {
				miro[i][j]=Integer.parseInt(jum[j]);
				}
		}
		int i=1;
		int j=1;
		for(int a =1; a<100; a++) {
			if(miro[i][j]==0) {
				miro[i][j]=9;
				if(miro[i+1][j]==1 && miro[i][j+1]==1 ){
					break;
				}else {
					j++;
				}
			}else if(miro[i][j]==2) {
				miro[i][j]=9;
				break;
			}else if(miro[i][j]==1) {
				j--;
				i++;
			}
			
		}
		
		
		for(int c=0; c<10; c++) {
			for(int e=0; e<10; e++) {
				System.out.print(miro[c][e]+" ");
			}
			System.out.println("");
		}
		} catch (Exception e) {
			
		}
	}
}