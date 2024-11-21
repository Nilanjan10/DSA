import java.util.*;
public class RevVowel {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.next();
            System.out.println(Reverse(s));
        }

    }
    public static String Reverse(String s){
        int start=0;
        int end=s.length()-1;
        char charArr[] = s.toCharArray();

        while(start<end){
            Set<Character> vowels = Set.of('a' , 'e' , 'i' , 'o' , 'u' , 'A' , 'E' , 'I' , 'O' , 'U');
            if(!vowels.contains(charArr[start])){
                start++;
                continue;
            }
            if(!vowels.contains(charArr[end])){
                end--;
                continue;
            }
            char c=charArr[start];
            charArr[start]=charArr[end];
            charArr[end]=c;

            start++;
            end--;
        }
        return String.valueOf(charArr);
    }
}
