import java.util.Scanner;

/**
 * RevWords
 */
public class RevWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            char c[] = s.toCharArray();
            String finals = "";
            String temps = "";
            for(int i=0;i<s.length();i++){
                if(c[i]==' '){
                    finals=" "+temps+finals;
                    temps=" ";
                }
                else{
                    
                    temps=temps+c[i];
                }
            }
            finals=temps+finals;
            System.out.println(finals.trim());
        }
    }
}