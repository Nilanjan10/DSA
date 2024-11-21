import java.util.*;
public class MostFreqWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            s=s.replaceAll("[^a-zA-Z0-9]"," ");
            String words[] = s.split("\\s+");

            Map<String,Integer> wordCount =new HashMap<>();
            for(String word : words){
                wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
            }
            String mostFreq = "";
            int maxFreq = 0;
            for(Map.Entry<String,Integer> entry : wordCount.entrySet()){
                if(entry.getValue()>maxFreq){
                    mostFreq = entry.getKey();
                    maxFreq = entry.getValue();
                }
            }
            System.out.println(mostFreq);
            System.out.println(maxFreq);
        }
    }
}
