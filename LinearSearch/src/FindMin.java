public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2,3,4,-6,1,0};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int m = arr[0];
        for(int i=1;i<arr.length;i++){
        if(arr[i]<m){
            m=arr[i];
        }}
        return m;
    }
}
