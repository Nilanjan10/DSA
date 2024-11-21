import java.util.*;
public class MaxSubstringK {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int k = sc.nextInt();
            System.out.println(MaxLengthK(s, k));
        }
    }
    public static int MaxLengthK(String s,int k){
        if(s==null || s.length()==0 || k<=0 || k>s.length()){
            return -1;
        }
        int start=0,end=0,maxfreq=0,maxlen=0;
        HashMap<Character,Integer> map = new HashMap<>();

        while (end<s.length()){
            char current = s.charAt(end);
            map.put(current, map.getOrDefault(current, 0)+1);

            maxfreq = Math.max(maxfreq, map.get(current));

            if(end-start+1-maxfreq>k){
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar)-1);
                start++;
            }
            maxlen = Math.max(maxlen, end-start+1);
            end++;
        }
        return maxlen;
    }
}