Question : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
Code :
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if ((int)((Math.log10(nums[i]))+1)%2==0)
            c++;
            }
        return c;
    }
}
