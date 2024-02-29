import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = sc.nextInt();
        System.out.println("Enter a digit you want to check frequency of: ");
        int d = sc.nextInt();
        int c=0;
        while(n>0){
            int rem = n%10;
            if(rem==d){
                c++;
            }
            n=n/10;
        }
        System.out.println(c);
    }
}
