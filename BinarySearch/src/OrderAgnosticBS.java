public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        int target = 22;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

        boolean isAscending;
        if (arr[start]<arr[end]){
            isAscending = true;
        }
        else {
            isAscending = false;
        }
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
                if(target<arr[mid]){
                    end=end-1;
                }
                else if (target>arr[mid]) {
                    start=start+1;
                }
            }
            else {
                if(target>arr[mid]){
                    end=end-1;
                }
                else if (target<arr[mid]) {
                    start=start+1;
                }
            }
        }
        return -1;
    }
}
