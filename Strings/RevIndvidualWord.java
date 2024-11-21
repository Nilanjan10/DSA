import java.util.Scanner;

public class RevIndvidualWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String temps = " ";
            String finals = " ";

            char ch[] = s.toCharArray();
            for(int i=0;i<s.length();i++){
                if(ch[i]==' '){
                    finals = finals+temps+" ";
                    temps=" ";
                }
                else{
                    temps=ch[i]+temps;
                }
            }
            finals=finals+temps;
            System.out.println(finals.trim());
        }
    }
}
