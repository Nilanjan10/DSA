public class Pattern4 {
    public static void main(String[] args) {


        form(4);
    }

    static void form(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
/*
1
1 2
1 2 3
1 2 3 4
 */
