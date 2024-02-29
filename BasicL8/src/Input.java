import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and age");
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(s);
        System.out.println(n);

    }
}
