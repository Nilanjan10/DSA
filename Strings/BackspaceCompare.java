import java.util.*;
public class BackspaceCompare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.nextLine();
            String st=sc.nextLine();
            System.out.println("It is "+Compare(s, st));
        }
    }
    public static boolean Compare(String s,String st){
        int i=s.length()-1;int j=st.length()-1;
        int skipS =0;int skipST = 0;

        while (i>=0 || j>=0) {
            while (i>=0) {
                if(s.charAt(i)=='#'){
                    skipS++;
                    i--;
                }
                else if (skipS>0) {
                    skipS--;
                    i--;
                }
                else{
                    break;
                }
            }
            while (j>=0) {
                if (st.charAt(j)=='#') {
                    skipST++;
                    j--;
                }
                else if (skipST>0) {
                    skipST--;
                    j--;
                }
                else{
                    break;
                }
            }
            if (i>=0 && j>=0 && s.charAt(i)!=st.charAt(j)) {
                return false;
            }
            if ((i>=0)!=(j>=0)) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
