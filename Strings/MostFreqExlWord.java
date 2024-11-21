import java.util.*;
public class MostFreqExlWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
   
            String words[] = s.toLowerCase().split("\\W+");
            HashMap<String,Integer> wordCount = new HashMap<>();
            String[] excludedArray = sc.nextLine().toLowerCase().split("\\s+");
            Set<String> excludedWords = new HashSet<>(Arrays.asList(excludedArray));

            for(String word : words){
                if(!excludedWords.contains(word)){
                    wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
                }
            }
            String mostFreq = null;
            int maxFreq = 0;
            for(Map.Entry<String,Integer> entry : wordCount.entrySet()){
                if(entry.getValue()>maxFreq){
                    maxFreq = entry.getValue();
                    mostFreq = entry.getKey();
                }
            }
            System.out.println(mostFreq+":"+maxFreq);
        }
    }
}
