public class Pattern9 {
        public static void main(String[] args) {
            int n = 3; // Height of the upper half of the pattern
            int totalRows = 2 * n - 1;

            for (int row = 1; row <= totalRows; row++) {
                int numSpaces = Math.abs(n - row);
                int maxNum = n - numSpaces;

                // Print leading spaces
                for (int space = 1; space <= numSpaces; space++) {
                    System.out.print(" ");
                }

                // Print decreasing numbers
                for (int col = maxNum; col >= 1; col--) {
                    System.out.print(col);
                }

                // Print increasing numbers
                for (int col = 2; col <= maxNum; col++) {
                    System.out.print(col);
                }

                System.out.println();
            }
        }
    }
/*
  1
 212
32123
 212
  1

 */
