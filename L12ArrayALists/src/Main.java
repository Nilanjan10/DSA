import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array : ");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
         arr[i] = sc.nextInt();

        }

//best way
        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
    }
}