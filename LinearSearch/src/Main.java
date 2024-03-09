 class main{
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,45};
        int t = 2;
        int ans = linearSearch(nums,t);
        int a = linearSindex(nums,t);
        System.out.print("Element "+ans+" is found ");
        System.out.println("at index : "+a);
    }
     //search in array:return the element if item found
     static int linearSearch(int[] arr, int target) {
         if (arr.length == 0) {
             return -1;
         }
         for (int i = 0; i < arr.length; i++) {
             int element = arr[i];
             if (element == target) {
                 return element;
             }
         }
         return -1;
     }
    //search in array:return the index if item found
    static int linearSindex(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for( int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
