////Bubble Sort
public class Main {
    public static void main(String[] args) {
    int ar[] = {4,2,0,-3,1};
    boolean swapped;
    for(int i=0;i<ar.length;i++){
        swapped=false;
        for(int j=1;j< ar.length;j++){
            if(ar[j]<ar[j-1]){
                int temp = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = temp;
                swapped=true;
            }
        }
        if (!swapped){
            break;
        }
        }
        for (int k = 0; k < ar.length; k++) {
            System.out.print(ar[k] + " ");
        }
        System.out.println();
    }
}