Question : https://leetcode.com/problems/missing-number/description/
Code : 
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total = n*(n+1)/2;
        for(int i:nums)
            total = total-i;
            return total;
        }
    }
