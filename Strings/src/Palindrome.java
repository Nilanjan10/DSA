import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String s="aba";
        System.out.println(isPal(s));
    }
    static boolean isPal(String s){
        s = s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
        char start = s.charAt(0);
        char end = s.charAt(s.length()-1-i);
        if(start!=end){
            return false;
        }
        }
        return true;
    }
}
