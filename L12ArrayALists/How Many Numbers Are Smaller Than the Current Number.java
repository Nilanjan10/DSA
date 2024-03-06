Question : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
Code : 
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
        int c=0;    
          for(int j=0;j<n;j++){
              if(nums[j]<nums[i])
              {
                  c++;
                 arr[i] = c;
               }
        
            }
        }
        return arr;
    }
}
