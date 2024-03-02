import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Greet());
        System.out.println("Sum : "+Sum2());
        Sum();
    }
    //string example
    static String Greet(){
        String message = "Lets Go!!";
        return message;
    }
//return the value
    static int Sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no.s : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a + b;
        return s;
    }
   static void Sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no.s : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a + b;
        System.out.println("Sum of 2 no.s : " + s);
    }
}