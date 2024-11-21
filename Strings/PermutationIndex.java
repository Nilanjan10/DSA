import java.util.*;
public class PermutationIndex {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String pattern = sc.nextLine();
            System.out.println(allAnagrams(s, pattern));
        }
    }
    public static List<Integer>allAnagrams(String s,String pattern){
        if(s==null || pattern==null || s.length()==0 || pattern.length()==0){
            return new ArrayList<>();
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            map.put(pattern.charAt(i),map.getOrDefault(pattern.charAt(i), 0)+1);
        }
        int start=0;int matched=0;
        List<Integer> anagramStartIndexes = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);

            if(map.containsKey(current)){
                map.put(current,map.get(current)-1);

                if(map.get(current)==0){
                    matched++;
                }
            }
            if (matched==map.size()) {
                anagramStartIndexes.add(start);
            }
            if (i>=pattern.length()-1) {
                char startChar = s.charAt(start++);

                if(map.containsKey(startChar)){
                    if (map.get(startChar)==0) {
                        matched--;
                    }
                    map.put(startChar,map.get(startChar)+1);
                }
            }
        }
        return anagramStartIndexes;
    }
}
