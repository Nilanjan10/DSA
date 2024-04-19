Question : https://leetcode.com/problems/majority-element/
Code : 
class Solution {
    public int majorityElement(int[] nums) {
        int elm = nums[0];
        int c = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elm){
                c++;
            }
            else{
                c--;
            } 
            if(c==0){
                elm = nums[i];
                c=1;
            }   
        }
        return elm;
    }
}
