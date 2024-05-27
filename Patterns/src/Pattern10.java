public class Pattern10 {
    public static void main(String[] args) {
        form(4);
    }

    static void form(int n) {
        int size = 2 * n - 1;
        int val = n;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                int atEveryIndex = val - Math.min(Math.min(row - 1, col - 1), Math.min(size - row, size - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
 */