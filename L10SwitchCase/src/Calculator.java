import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arithmetic operation: ");
        char c = sc.next().trim().charAt(0);
        System.out.println("Enter 2 no.s : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (c){
            case '+':
                int sum = a+b;
                System.out.println("Sum = "+sum);
                break;
            case '-':
                int diff = a-b;
                System.out.println("Difference = "+diff);
                break;
            case '*':
                float mul = a*b;
                    System.out.println("Multiplication = "+mul);
                    break;
            case '/':
                double div = a/b;
                     System.out.println("Quotient = "+div);
                     break;
            case '%':
                float mod = a%b;
                System.out.println("Remainder = "+mod);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
