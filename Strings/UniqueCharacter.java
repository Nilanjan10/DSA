import java.util.*;
public class UniqueCharacter {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
        String s = sc.nextLine();
        boolean charExist[] = new boolean[256];
        int unique=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!charExist[c]){
                charExist[c]=true;
                unique++;
            }
        }
        System.out.println(unique);
    }
}
}