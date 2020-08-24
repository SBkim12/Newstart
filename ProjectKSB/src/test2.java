public class test2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int i=3;
      int j=1;
      while(i<9) {
         if((i==3 || i==5) && j==1) {
            System.out.println("<" + i + "´Ü>");
         }
         
         System.out.printf("%d * %d = %d\n", i,j,i*j);
         
         j++;
         if(j==10) {
            System.out.println();
            i++;
            j=1;
         }
      }
   }

}