//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {15,25,35},
                {28,29,37}
        };
        System.out.println(Arrays.toString(Search(arr,29)));
    }
    static int[] Search(int[][] matrix, int target){
        int r=0;int c= matrix.length-1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(target>matrix[r][c]){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}