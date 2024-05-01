Question : https://leetcode.com/problems/spiral-matrix/
Code : 
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length; //no.of rows
        int m = matrix[0].length; //no.of columns
        int start = 0;int end = m-1;
        int top = 0;int bottom = n-1;
        while(start<=end && top<=bottom){
            //traverse top row
            for(int i=start;i<=end;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //traverse right column
        for(int i=top;i<=bottom;i++){
            ans.add(matrix[i][end]);
            }
            end--;
            //traverse bottom row
            if(top<=bottom){
            for(int i=end;i>=start;i--){
                ans.add(matrix[bottom][i]);
            }
                bottom--;
            }
            //traverse left column
            if(start<=end){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][start]);
                }
                start++;
            }
        }    
        
        return ans;
    }
}
