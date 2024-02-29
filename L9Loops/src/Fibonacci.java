import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a=0,b=1; //to print series
//        System.out.print(a);
//        System.out.print(", "+b);
//        for(int i=0;i<=n;i++) {
//            int s = a + b;
//            a = b;
//            b = s;
//            System.out.print(", " + b);
//        }
    int a=0,b=1,count=2; //to find nth fibonacci no.
    while(count<=n){
        int t=b;
        b=b+a;
        a=t;
        count++;
    }
        System.out.println(b);
    }
}
