
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
       // System.out.println(Arrays.toString(a));
       // swap(a,1,2);
        reverse(a);
        System.out.println(Arrays.toString(a));

    }
    static void swap(int a[],int index1,int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
    static void reverse(int a[]){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
}
