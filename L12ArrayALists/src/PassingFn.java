import java.util.Arrays;
import java.util.Scanner;
public class PassingFn {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4};
        System.out.println(Arrays.toString(ar));
        Change(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void Change(int[] n){
        n[1] = 9;
    }
}
