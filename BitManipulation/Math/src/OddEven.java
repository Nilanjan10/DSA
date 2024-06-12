//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OddEven {
    public static void main(String[] args) {
        int n = -3;
        System.out.println(check(n));
    }
    static String check(int n){
        if ((n&1)==1) {
            return "odd";
        }
        return "even";
    }
}