import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no.s");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1+n2;
        System.out.println("Sum = "+sum);
    }
}
