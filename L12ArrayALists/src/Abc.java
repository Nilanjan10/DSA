import java.util.Arrays;
import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names");
        String[] s = new String[5];
        for(int i=0;i< s.length;i++){
            s[i] = sc.next();
        }
        System.out.println(Arrays.toString(s));
        //modify
        s[2]="Nilanjan";
        System.out.println(Arrays.toString(s));
    }
}
