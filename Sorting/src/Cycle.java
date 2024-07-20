import java.util.*;
public class Cycle {
    public static void main(String[] args) {
        int ar[]={3,2,4,1};
        for (int i=0;i< ar.length;i++){
            int correct = ar[i]-1;
            if(ar[i]!=ar[correct]){
                int temp=ar[correct];
                ar[correct]=ar[i];
                ar[i]=temp;
            }
        }
            System.out.print(Arrays.toString(ar));
    }
}
