public class Pattern6 {
    public static void main(String[] args) {


        form(5);
    }

    static void form(int n) {
        for (int row = 1; row <= 2 * n; row++) {
           for(int s=0;s<Math.abs(n-row);s++){
               System.out.print(" ");
           }
            if (row <= n) {


                for (int col = 1; col <= row; col++) {

                    System.out.print(" *");
                }
                System.out.println();
            } else {
                for (int col = 1; col <= 2*n - row; col++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}

/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

 */