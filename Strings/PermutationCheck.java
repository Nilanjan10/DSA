import java.util.*;
public class PermutationCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String pattern = sc.nextLine();
            System.out.println(Check(s, pattern));
        }
    }
    public static boolean Check(String s,String pattern){
        if (s==null || s.length()==0 || pattern==null || pattern.length()==0) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0)+1);
        }
        int start=0;int matched = 0;

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);

            if(map.containsKey(current)){
                map.put(current, map.get(current)-1);

                if (map.get(current) == 0) {
                    matched++;
                }
            }
            if (matched==map.size()) {
                return true;
            }
            if(i>=pattern.length()-1){
                char charAtStart = s.charAt(start++);

                if (map.containsKey(charAtStart)) {
                    if (map.get(charAtStart)==0) {
                        matched--;
                    }
                    map.put(charAtStart,map.get(charAtStart)+1);
                }
            }
        }
        return false;
    }
}
