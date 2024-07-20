Question : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
Code : 
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       for(int i:nums){
       int ind=Math.abs(i);
       if(nums[ind-1]>0){
       nums[ind-1]*=-1; 
    }
}
List<Integer> res = new ArrayList<>();
for(int i=0;i<nums.length;i++){
    if(nums[i]>0){
        res.add(i+1);
    }
}
return res;
    }
}
