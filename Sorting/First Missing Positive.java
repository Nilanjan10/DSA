Question : https://leetcode.com/problems/first-missing-positive/description/
Code : 
class Solution {
    public int firstMissingPositive(int[] nums) {
        int miss = 1;
        Arrays.sort(nums);
        for(int i:nums)
        if(i>0){
            if(i==miss)
                miss++;
            
            else if(i>miss)
                break;
            
        }
        return miss;
    }
}
