public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {5,4,9,2,5,8};
        int target = 8;
        System.out.println(linearSearch(arr,target,2,6));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i=start;i<end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
