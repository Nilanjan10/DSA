import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
        int a[] = {8, 2, 9, 11};
        System.out.println(max(a));
        System.out.println(maxRange(a,1,3));
    }

    static int max(int a[]) {
        int m = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > m)
                m = a[i];
        }

        return m;

    }
    static int maxRange(int a[],int start,int end){
        int m=a[start];
        for (int i = start;i<end;i++){
            if(a[i]>m)
                m=a[i];
        }
        return m;
    }
}
