import java.util.*;
public class WordFreq {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String st = s.toLowerCase().replaceAll("[^a-zA-z0-9]", " ");
            String[] words=st.split("\\s+");
            HashMap<String,Integer> wordCount = new HashMap<>();
            for(String word : words){
                wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        }
        for(Map.Entry<String,Integer> entry : wordCount.entrySet()){
            System.out.println(entry);
        }
        }
    }
}
