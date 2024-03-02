import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int n = sc.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<n;i++)
            if(n%i==0)
                return false;
        return true;

    }
}
