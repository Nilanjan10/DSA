import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check if it is in upper/lower case : ");
        char c = sc.next().charAt(0);
        System.out.println("Character it is checking is "+c);
//        int n = (int)c;
//        if(n>=65 && n<=90)
//        {
//            System.out.println("It is in Upper case");
//        }
//        if(n>=97 && n<=122)
//        {
//            System.out.println("It is in Lower case");
//        }
        if(c>='a' && c<='z'){
            System.out.println("Lower case");
        }
        if(c>='A' && c<='Z'){
            System.out.println("Upper case");
        }
    }
}
