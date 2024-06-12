public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 4;
        int ans = 1;
        while(power>0){
            if ((power & 1)==1){//4=100so 0 AND 1 is 0
                ans*=base;
            }
            base *= base;
            power = power>>1;
        }
        System.out.println(ans);
    }
}
