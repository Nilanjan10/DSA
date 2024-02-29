import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 no.s : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int l = 0;
        if(n1>n2){
            l = n1;

        }
        else {
            l=n2;

        }
        if (n3>l){
            l=n3;

        }

        System.out.println(l);
//        l = Math.max(n3,Math.max(n1,n2));
//        System.out.println(l);
   }
}