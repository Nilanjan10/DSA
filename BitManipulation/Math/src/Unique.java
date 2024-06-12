public class Unique {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,5,5};
        System.out.println(single(arr));
    }
    static int single(int arr[]){
        int un = 0;
        for(int i=0;i< arr.length;i++){
            un=arr[i]^un;
        }
        return un;
    }
}
