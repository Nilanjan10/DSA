import java.util.*;
public class LongestSubstringUniqueChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            System.out.println("Output = "+ Calculation(s));
        }
    }
    public static int Calculation(String s){
        if (s==null || s.length()==0) {
            return -1;
        }
        int maxLength=0;
        int start=0,end;
        start=end=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while (end<s.length()) {
            char current = s.charAt(end);
            if (map.containsKey(current)) {
                start=Math.max(start, map.get(current)+1);
            }
            map.put(current, end);
            maxLength = Math.max(maxLength, end-start+1);
            end++;
        }
        return maxLength;
    }
}