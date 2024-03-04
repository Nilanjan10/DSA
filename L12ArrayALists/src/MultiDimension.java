import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("length of the array or no.of rows: "+arr.length);//no.of rows
        //input
        System.out.println("enter array elements : ");
        for(int r=0;r< arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                arr[r][c]=sc.nextInt();
            }
        }
        //output
        for(int r=0;r< arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
