import java.util.*;
/*
public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int k = sc.nextInt();
      System.out.println(Calculation(s, k));
        }

    }
    public static int Calculation(String s,int k) {
        if(s == null || s.length() == 0 || k==0){
            return -1;
        }
        
        int distinct = 0;
        int maxcount = 0;
        int left = 0;
        int[] charCount = new int[26];// Array for lowercase English letters only

        for (int right = 0; right < s.length(); right++) {
        int rightCharIndex = s.charAt(right)-'a';
            if (charCount[rightCharIndex] == 0) {
                distinct++;
            }
            charCount[rightCharIndex]++;

            // Shrink the window until we have exactly k distinct characters
            while (distinct > k) {
                int leftCharIndex = s.charAt(left) - 'a';
                charCount[leftCharIndex]--;
                if (charCount[leftCharIndex] == 0) {
                    distinct--;
                }
                left++;
            }
             // Update maxLength if we have exactly k distinct characters in the current window
            if (distinct == k) {
                maxcount = Math.max(maxcount, right - left + 1);
            }
        }
        return maxcount;
    }
}
*/
public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int k = sc.nextInt();
      System.out.println("output = "+Calculation(s, k));
        }
    }
    public static int Calculation(String s,int k) {
        if(s == null || s.length() == 0 || k==0){
            return -1;
        }
        int maxLength = 0;
        int left =0;
        HashMap<Character,Integer> charCount = new HashMap<>();

        for (int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            charCount.put(current, charCount.getOrDefault(current,0)+1);

            while (charCount.size() > k) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar)-1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }
            if (charCount.size()==k) {
                maxLength=Math.max(maxLength, right-left+1);
            
            }
        }
        
        return maxLength;
    }
}