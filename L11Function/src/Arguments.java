import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        System.out.println("Sum :"+Sum2(10,20));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String n = sc.nextLine();
        System.out.println(Greet(n));
    }
    //int
    static int Sum2(int a,int b) {
        int s = a + b;
        return s;
    }
    //string
    static String Greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
