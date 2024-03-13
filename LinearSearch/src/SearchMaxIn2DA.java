public class SearchMaxIn2DA {
    public static void main(String[] args) {
        int[][] arr = {{2,1,3},
                {5,6,4},
                {7,8,9}};
        System.out.println(Max(arr));
    }
    static int Max(int[][] arr){
        int max = arr[0][0];
        for (int[] ints : arr)
            for (int anInt : ints) if (anInt > max) {
                max = anInt;
            }
        return max;
    }
}
