import java.util.*;
public class SmallestSubstring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.nextLine();
            String pattern=sc.nextLine();
            System.out.println(smallestSubString(s, pattern));
        }
    }
    public static String smallestSubString(String s,String pattern){
        if(s==null || s.length()==0 || pattern==null || pattern.length()==0){
            return " ";
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            map.put(pattern.charAt(i),map.getOrDefault(pattern.charAt(i), 0)+1);
        }
        int start=0;int matched=0;int minSublength=Integer.MAX_VALUE;
        int minSubstart=0;
        
        for(int end=0;end<s.length();end++){
            char current=s.charAt(end);

            if(map.containsKey(current)){
                map.put(current, map.get(current)-1);

                if (map.get(current)>=0) {
                    matched++;
                }
            }
            while (matched==pattern.length()) {
                if (end-start+1<minSublength) {
                    minSublength = end-start+1;
                    minSubstart=start;
                }
                char charAtStart = s.charAt(start++);

                if (map.containsKey(charAtStart)) {
                  if (map.get(charAtStart) == 0) {
                    matched--;
                  }
        
                  map.put(charAtStart, map.get(charAtStart) + 1);
                }
              }
        
            }
        
            if (minSublength > s.length()) {
              return "";
            }
        
            return s.substring(minSubstart, minSubstart + minSublength);
          }
        }
    