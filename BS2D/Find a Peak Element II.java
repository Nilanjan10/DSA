Question : https://leetcode.com/problems/find-a-peak-element-ii/
Code : 
class Solution {
    int findMaxIndex(int[][] mat,int n,int m,int col){
        int max=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index = i;
            }
        }
        return index;
    }
    
   public int[] findPeakGrid(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    int start = 0;
    int end = m - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        int maxRowIndex = findMaxIndex(mat, n, m, mid);
        
        int left;
        if (mid - 1 >= 0) {
            left = mat[maxRowIndex][mid - 1];
        } else {
            left = -1;
        }
        
        int right;
        if (mid + 1 < m) {
            right = mat[maxRowIndex][mid + 1];
        } else {
            right = -1;
        }
        
        if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
            return new int[]{maxRowIndex, mid};
        } else if (mat[maxRowIndex][mid] < left) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return new int[]{-1, -1};
}
}
