public class Insertion {
    public static void main(String[] args) {
        int ar[] ={5,4,1,3,2};
        for(int i=0;i< ar.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(ar[j]<ar[j-1]){
                    int temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i< ar.length;i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
