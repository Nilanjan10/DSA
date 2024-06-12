public class SetBits {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(Integer.toBinaryString(n));
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        System.out.println(c);
    }
}
